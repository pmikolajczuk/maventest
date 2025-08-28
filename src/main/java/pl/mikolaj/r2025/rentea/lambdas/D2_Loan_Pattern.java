package pl.mikolaj.r2025.rentea.lambdas;

import java.io.File;
import java.util.Date;
import java.util.stream.Stream;

interface OrderRepo {
	Stream<Order> findByActiveTrue();	//1 mln orders
}

class OrderExporter {
	private OrderRepo repo;

	public File exportFile(String fileName) {
		File file = new File ("export/" + fileName);

		return file;
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