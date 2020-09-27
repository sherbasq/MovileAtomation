package runner;

import activity.NoteManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepdefs {

    NoteManager noteManager = new NoteManager();

    @Given("^I have acces to the app$")
    public void iHaveAccesToTheApp() {
    }

    @When("^I click the note button$")
    public void iClickTheNoteButton() throws MalformedURLException {
        noteManager.addButton.click();
    }

    @And("^I set the tittle note$")
    public void iSetTheTittleNote() throws MalformedURLException {
        noteManager.texTituloNota.senKeys("Nota");
    }

    @And("^I set the body note$")
    public void iSetTheBodyNote() throws MalformedURLException {
        noteManager.textBodyNota.senKeys("BodyNota");
    }

    @And("^I set the date$")
    public void iSetTheDate() throws MalformedURLException {
        noteManager.fechaButton.click();
        noteManager.fijarFecha.click();
        noteManager.addFechaLimiteButton.click();
    }

    @And("^I set the hour$")
    public void iSetTheHour() throws MalformedURLException {
        noteManager.fijaHora.click();
        noteManager.addHoraButton.click();
    }

    @And("^I set the remember$")
    public void iSetTheRemember() throws MalformedURLException {
        noteManager.agrRecordatorio.click();
        noteManager.addRecordatorioButton.click();
    }

    @And("^I set the repeater$")
    public void iSetTheRepeater() throws MalformedURLException {
        noteManager.fijaRepetidor.click();
        noteManager.addRepetidorButton.click();
    }

    @And("^I click the save note$")
    public void iClickTheSaveNote() throws MalformedURLException {
        noteManager.saveButton.click();
    }

    @Then("^I add a new note$")
    public void iAddANewNote() throws MalformedURLException {
        noteManager.txtNota.getText();
        //Verificacion
        String actualNote=noteManager.txtNota.getText();
        String expectedNote="Nota";
        Assert.assertEquals("El Titulo de la Nota es Correcto",actualNote,expectedNote);
    }
}

