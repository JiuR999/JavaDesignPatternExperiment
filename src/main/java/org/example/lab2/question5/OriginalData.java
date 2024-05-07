package org.example.lab2.question5;

public class OriginalData implements Data{
    private String data;

    public OriginalData(String data) {
        this.data = data;
    }

    @Override
    public String processData() {
        return this.data;
    }
}
