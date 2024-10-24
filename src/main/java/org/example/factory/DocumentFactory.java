package org.example.factory;

public class DocumentFactory {

    public static Document createDocument(String type) {
        switch (type) {
            case "PDF":
                return new PDFDocument();
            case "Word":
                return new WordDocument();
            case "HTML":
                return new WordDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}

public class PDFDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening PDF Document");
        }

        @Override
        public void save() {
            System.out.println("Saving PDF Document");
        }
}

public class WordDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening Word Document");
        }

        @Override
        public void save() {
            System.out.println("Saving Word Document");
        }
}


