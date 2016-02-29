package ex1.service;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by gss on 29.02.2016.
 */
public class EmployeeActions {

    private static Document getDocument() throws Exception {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setValidating(false);
            DocumentBuilder builder = dbf.newDocumentBuilder();
            return builder.parse(new File(String.valueOf("D:\\dev\\pro.krait.labs\\src\\main\\resources\\employee_db.xml")));
        } catch (Exception exception) {
            String message = "XML parsing error!";
            throw new Exception(message);
        }
    }

    public void employeeList() throws ParserConfigurationException, IOException, SAXException {

        try {
            Document doc = getDocument();
            doc.getDocumentElement().normalize();
            NodeList eList = doc.getElementsByTagName("employee");

            for (int i = 0; i < eList.getLength(); i++)
            {
                Node eNode = eList.item(i);
                Element eElement = (Element) eNode;
                System.out.println("----------------------------------------------------");
                System.out.println("№ сотрудника: " + eElement.getAttribute("id"));
                System.out.println("ФИО: " + eElement.getElementsByTagName("fio").item(0).getTextContent());
                System.out.println("Дата рождения: " + eElement.getElementsByTagName("birthdate").item(0).getTextContent());
                System.out.println("Дата принятия на работу: " + eElement.getElementsByTagName("startworkdate").item(0).getTextContent());
                System.out.println("----------------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

