package pl.mikolaj.rentea.lambdas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.function.Consumer;
import java.util.stream.Stream;

interface OrderRepo {
    Stream<Order> findByActiveTrue();
}

class FileExporter {
    public File exportFile(String fileName, Consumer<Writer> contentWriter) throws IOException{
        File file = new File("export/" + fileName);
        try (Writer writer = new FileWriter(file)) {
            contentWriter.accept(writer);
            return file;
        }
    }
}

class OrderExportWriter {
    private OrderRepo repo;

    protected void writeContent(Writer writer) throws IOException {
        writer.write("OrderID;Date\n");
        repo.findByActiveTrue()
                .map(o -> o.getId() + ";" + o.getCreationDate())
                .forEach(Unchecked.consumer(writer::write));
    }

}

class Client {
    public static void main(String[] args) throws IOException{
        FileExporter fileExporter = new FileExporter();
        OrderExportWriter orderExportWriter = new OrderExportWriter();
        fileExporter.exportFile("orders.csv", Unchecked.consumer(orderExportWriter::writeContent));
    }
}

class Order {
    private Long id;
    private Date creationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

@FunctionalInterface
interface CheckedConsumer<T, E extends Throwable> {
    public void accept(T t) throws E;
}

class Unchecked {
    public static <T, E extends Throwable> Consumer<T> consumer(CheckedConsumer<T, E> consumer) {
        return t -> {
            try {
                consumer.accept(t);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        };
    }
}
