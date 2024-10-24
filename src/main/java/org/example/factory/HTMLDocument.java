package org.example.factory;

public class HTMLDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening HTML Document");
        }

        @Override
        public void save() {
            System.out.println("Saving HTML Document");
        }
}
