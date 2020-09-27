package testClean;

import activity.NoteManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import sessionManager.Session;

import java.net.MalformedURLException;

public class TestAddNote {
    NoteManager noteManager = new NoteManager();

    @Test
    public void verifyAddNote() throws MalformedURLException {
        noteManager.addButton.click();
        noteManager.texTituloNota.senKeys("Nota");
        noteManager.textBodyNota.senKeys("BodyNota");
        noteManager.fechaButton.click();
        noteManager.fijarFecha.click();
        noteManager.addFechaLimiteButton.click();
        noteManager.fijaHora.click();
        noteManager.addHoraButton.click();
        noteManager.agrRecordatorio.click();
        noteManager.addRecordatorioButton.click();
        noteManager.fijaRepetidor.click();
        noteManager.addRepetidorButton.click();
        noteManager.saveButton.click();
        noteManager.txtNota.getText();
        //Verificacion
        String actualNote=noteManager.txtNota.getText();
        String expectedNote="Nota";
        Assert.assertEquals("El Titulo de la Nota es Correcto",actualNote,expectedNote);
    }

    @Test
    public void verifyDeleteNote () throws MalformedURLException {
        noteManager.addButton.click();
        noteManager.texTituloNota.senKeys("Nota");
        noteManager.textBodyNota.senKeys("BodyNota");
        noteManager.fechaButton.click();
        noteManager.fijarFecha.click();
        noteManager.addFechaLimiteButton.click();
        noteManager.fijaHora.click();
        noteManager.addHoraButton.click();
        noteManager.agrRecordatorio.click();
        noteManager.addRecordatorioButton.click();
        noteManager.fijaRepetidor.click();
        noteManager.addRepetidorButton.click();
        noteManager.saveButton.click();
        noteManager.selNota.click();
        noteManager.deleteButton.click();
        noteManager.confirmDelete.click();
        noteManager.txtList.getText();
        //Verificacion
        String actualList=noteManager.txtList.getText();
        String expectedList="No tasks added";
        Assert.assertEquals("La lista esta vacia",actualList,expectedList);
    }

    @After
    public void after () throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
