package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyService {

    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void clearItems() {
        items.clear();
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
