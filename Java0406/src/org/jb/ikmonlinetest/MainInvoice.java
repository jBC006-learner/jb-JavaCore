package org.jb.ikmonlinetest;

public class MainInvoice {

	public static void main(String[] args) {
		Invoice invoice = new SalesInvoice();
		System.out.println(invoice.formatId("1234"));
		System.out.println("<<------->>");
//		will output 1234_SalesInvoice 
        Invoice invoice1 = new Invoice();
		System.out.println(invoice1.formatId("1234"));
//		will output 1234_Invoice
		SalesInvoice invoice2 = new SalesInvoice();
		System.out.println(invoice2.formatId("1234"));
//		will output 1234_Invoice
		SalesInvoice invoice3 = new SalesInvoice();
		System.out.println(Invoice.formatId("1234"));
//		will output 1234_SalesInvoice
		Invoice invoice4 = new Invoice();
//		System.out.println((SalesInvoice)Invoice.formatId("1234"));
//		will output 1234_SalesInvoice
	}

}