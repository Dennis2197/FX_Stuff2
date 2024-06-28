module com.brh.fxstuff.fx_stuff {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires javafx.web;

    opens com.brh.fxstuff.fx_stuff to javafx.fxml;
    exports com.brh.fxstuff.fx_stuff;
}