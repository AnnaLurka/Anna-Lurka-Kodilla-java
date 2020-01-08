package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item1 = new Item(new BigDecimal(50000), 2);
        Item item2 = new Item(new BigDecimal(2000), 3);
        Product product1 = new Product("car");
        Product product2 = new Product("bike");
        item1.setProduct(product1);
        item2.setProduct(product2);

//        Invoice invoice1 = new Invoice("17");
//        invoice1.getItems().add(item1);
//        invoice1.getItems().add(item2);
//        item1.setInvoice(invoice1);
//        item2.setInvoice(invoice1);
//
//        productDao.save(product1); ??
//        item2.setProduct(product1); ??
//
//        //When
//        invoiceDao.save(invoice1);
//        int invoiceId = invoice1.getId();
//
//        //Then
//        Assert.assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.deletById(invoiceId);
    }
}
