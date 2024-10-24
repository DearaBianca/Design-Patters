package org.example;

import org.example.factory.Document;
import org.example.factory.DocumentFactory;

public class DocumentEditor {

    public void openDocument(String type) {
        Document doc = DocumentFactory.createDocument(type);
        doc.open();
    }

    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        // TODO: Test opening different types of documents (PDF, Word, HTML)
        editor.openDocument("PDF");
        editor.openDocument("Word");
        editor.openDocument("HTML");
    }
}