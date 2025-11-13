package com.example.test;

public enum ViewIds {
    HOME("HomeView.fxml"),
    SALES("SalesView.fxml"),
    STATS("StatsView.fxml"),
    PRODUCTS("ProductsView.fxml"),
    INVOICES("InvoicesView.fxml"),
    STAFF("StaffView.fxml"),
    CUSTOMERS("CustomersView.fxml"),
    PROMOTIONS("PromotionsView.fxml");

    public final String fxml;
    ViewIds(String fxml) { this.fxml = fxml; }
}
