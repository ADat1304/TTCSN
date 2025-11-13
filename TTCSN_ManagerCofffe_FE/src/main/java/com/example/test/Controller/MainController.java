package com.example.test.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;

public class MainController {

    @FXML private StackPane contentHolder;
    @FXML private Label titleLabel;
    @FXML private ToggleGroup menuGroup;

    // Đường dẫn tuyệt đối tới các FXML con (nằm trong src/main/resources)
    private static final String HOME        = "/com/example/test/HomeView.fxml";
    private static final String SALES       = "/com/example/test/SalesView.fxml";
    private static final String STATS       = "/com/example/test/view/StatsView.fxml";
    private static final String PRODUCTS    = "/com/example/test/view/ProductsView.fxml";
    private static final String INVOICES    = "/com/example/test/view/InvoicesView.fxml";
    private static final String STAFF       = "/com/example/test/view/StaffView.fxml";
    private static final String CUSTOMERS   = "/com/example/test/view/CustomersView.fxml";
    private static final String PROMOTIONS  = "/com/example/test/view/PromotionsView.fxml";

    @FXML
    public void initialize() {
        // Nạp mặc định Trang chủ
        openView(HOME, "Trang chủ");

        // Chọn toggle đầu tiên (nếu có) để highlight menu
        if (menuGroup != null && !menuGroup.getToggles().isEmpty()) {
            ((ToggleButton) menuGroup.getToggles().get(0)).setSelected(true);
        }
    }

    // ====== Menu actions ======
    @FXML private void openHome()       { openView(HOME, "Trang chủ"); }
    @FXML private void openSales()      { openView(SALES, "Bán hàng"); }
//    @FXML private void openStats()      { openView(STATS, "Thống kê"); }
//    @FXML private void openProducts()   { openView(PRODUCTS, "Sản phẩm | Menu"); }
//    @FXML private void openInvoices()   { openView(INVOICES, "Hóa đơn"); }
//    @FXML private void openStaff()      { openView(STAFF, "Nhân viên"); }
//    @FXML private void openCustomers()  { openView(CUSTOMERS, "Khách hàng"); }
//    @FXML private void openPromotions() { openView(PROMOTIONS, "Khuyến mãi"); }

    @FXML
    private void logout() {
        // TODO: xử lý đăng xuất
        System.out.println("Đăng xuất...");
    }

    // ====== Core loader ======
    private void openView(String absolutePath, String title) {
        try {
            URL url = getClass().getResource(absolutePath);
            if (url == null) {
                throw new IllegalStateException("Không tìm thấy FXML: " + absolutePath);
            }
            Node view = FXMLLoader.load(url);
            contentHolder.getChildren().setAll(view);
            titleLabel.setText(title);
        } catch (IOException e) {
            // Nên log rõ để debug khi phát sinh lỗi đọc FXML
            throw new RuntimeException("Lỗi khi nạp view: " + absolutePath, e);
        }
    }
}
