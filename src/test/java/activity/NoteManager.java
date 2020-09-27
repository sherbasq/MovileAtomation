package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class NoteManager {
    public Button addButton;
    public TextBox texTituloNota;
    public TextBox textBodyNota;
    public Button fechaButton;
    public Button fijarFecha;
    public Button addFechaLimiteButton;
    public Button fijaHora;
    public Button addHoraButton;
    public Button agrRecordatorio;
    public Button addRecordatorioButton;
    public Button fijaRepetidor;
    public Button addRepetidorButton;
    public Button saveButton;
    public Label txtNota;
    public Button selNota;
    public Button deleteButton;
    public Button confirmDelete;
    public Label txtList;

    public NoteManager(){
        addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        texTituloNota = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        textBodyNota = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        fechaButton = new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder"));
        fijarFecha = new Button(By.id("com.vrproductiveapps.whendo:id/due_date"));
        addFechaLimiteButton = new Button(By.id("android:id/button1"));
        fijaHora = new Button(By.id("com.vrproductiveapps.whendo:id/time"));
        addHoraButton = new Button(By.id("android:id/button1"));
        agrRecordatorio = new Button(By.id("com.vrproductiveapps.whendo:id/reminder"));
        addRecordatorioButton = new Button(By.xpath("//android.widget.RadioButton[@text='5 minutes before']"));
        fijaRepetidor = new Button(By.id("com.vrproductiveapps.whendo:id/repeat"));
        addRepetidorButton = new Button(By.xpath("//android.widget.RadioButton[contains(@text,'Daily')]"));
        saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        txtNota = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        selNota = new Button(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
        confirmDelete = new Button(By.id("android:id/button1"));
        txtList = new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));

    }

}
