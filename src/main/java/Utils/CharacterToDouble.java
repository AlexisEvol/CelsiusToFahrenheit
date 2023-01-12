package Utils;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextField;

public class CharacterToDouble {

    private String stringNumber = "";
    private StringBuilder newNumber;
    private double temperatureNumber;
    private final List<Character> correctKeysList = Arrays.asList('-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ',');

    public double transformCharToDouble(JTextField textField, KeyEvent evt) {

        if (correctKeysList.contains(evt.getKeyChar())) {
            stringNumber = stringNumber + evt.getKeyChar();
        }
        try {

            newNumber = new StringBuilder(stringNumber);
            textField.setForeground(Color.black);

            if (evt.getKeyCode() != 8 && evt.getKeyCode() != 127)//If the key pressed is not DELETE/SUPR
            {
                temperatureNumber = Double.parseDouble(stringNumber.replace(',', '.'));
            } 
            else if (evt.getKeyCode() == 8) {//If the key pressed is DELETE

                int erasedPosition = textField.getCaretPosition();
                newNumber.deleteCharAt(erasedPosition - 1);
                stringNumber = newNumber.toString();
                temperatureNumber = Double.parseDouble(stringNumber);
            } 
            else if (evt.getKeyCode() == 127) {//If the key pressed is SUPR

                int erasedPosition = textField.getCaretPosition();
                newNumber.deleteCharAt(erasedPosition);
                stringNumber = newNumber.toString();
                temperatureNumber = Double.parseDouble(stringNumber);
            }
        } catch (Exception e) {
            textField.setForeground(Color.red);
        }
        return temperatureNumber;
    }
}
