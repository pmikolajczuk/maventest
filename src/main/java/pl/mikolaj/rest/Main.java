package pl.mikolaj.rest;

public class Main {
    public static void main(String[] args) {
        DatabaseClientMock dbMock = new DatabaseClientMock();



        String usersString = dbMock.getUsers();
        System.out.println(usersString);
    }
}
