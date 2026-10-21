/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.av3;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
 *
 * @author pedagogico
 */
public class GanelaAv3 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GanelaAv3.class.getName());

    /**
     * Creates new form GanelaAv3
     */
    public GanelaAv3() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(0,0,0));
        
        addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e){
                Color corOriginal = btnQ.getBackground();
                
                if(e.getKeyCode() == KeyEvent.VK_Q){
                    System.out.println("Você apertou Q");
                    btnQ.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "q";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnQ.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_W){
                    System.out.println("Você apertou W");
                    btnW.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "w";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnW.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_E){
                    System.out.println("Você apertou W");
                    btnE.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "e";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnE.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_R){
                    System.out.println("Você apertou R");
                    btnR.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "r";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnR.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_T){
                    System.out.println("Você apertou T");
                    btnT.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "t";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnT.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_Y){
                    System.out.println("Você apertou Y");
                    btnY.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "y";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnY.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_U){
                    System.out.println("Você apertou U");
                    btnU.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "u";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnU.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_I){
                    System.out.println("Você apertou I");
                    btnI.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "i";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnI.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_O){
                    System.out.println("Você apertou O");
                    btnO.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "o";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnO.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_P){
                    System.out.println("Você apertou P");
                    btnP.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "p";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnP.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_A){
                    System.out.println("Você apertou A");
                    btnA.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "a";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnA.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_S){
                    System.out.println("Você apertou S");
                    btnS.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "s";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnS.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_D){
                    System.out.println("Você apertou D");
                    btnD.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "d";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnD.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_F){
                    System.out.println("Você apertou F");
                    btnF.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "f";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnF.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_G){
                    System.out.println("Você apertou G");
                    btnG.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "g";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnG.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_H){
                    System.out.println("Você apertou H");
                    btnH.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "h";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnH.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_J){
                    System.out.println("Você apertou J");
                    btnJ.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "j";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnJ.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_K){
                    System.out.println("Você apertou K");
                    btnK.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "k";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnK.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_L){
                    System.out.println("Você apertou L");
                    btnL.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "l";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnL.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_Z){
                    System.out.println("Você apertou Z");
                    btnZ.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "z";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnZ.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_X){
                    System.out.println("Você apertou X");
                    btnX.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "x";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnX.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_C){
                    System.out.println("Você apertou C");
                    btnC.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "c";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnC.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_V){
                    System.out.println("Você apertou V");
                    btnV.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "v";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnV.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_B){
                    System.out.println("Você apertou B");
                    btnB.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "b";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnB.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_N){
                    System.out.println("Você apertou N");
                    btnN.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "n";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnN.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_M){
                    System.out.println("Você apertou M");
                    btnM.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "m";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnM.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_0){
                    System.out.println("Você apertou 0");
                    btn0.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "0";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn0.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_1){
                    System.out.println("Você apertou 1");
                    btn1.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "1";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn1.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_2){
                    System.out.println("Você apertou 2");
                    btn2.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "2";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn2.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_3){
                    System.out.println("Você apertou 3");
                    btn3.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "3";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn3.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_4){
                    System.out.println("Você apertou 4");
                    btn4.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "4";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn4.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_5){
                    System.out.println("Você apertou 5");
                    btn5.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "5";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn5.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_6){
                    System.out.println("Você apertou 6");
                    btn6.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "6";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn6.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_7){
                    System.out.println("Você apertou 7");
                    btn7.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "7";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn7.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_8){
                    System.out.println("Você apertou 8");
                    btn8.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "8";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn8.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_9){
                    System.out.println("Você apertou 9");
                    btn9.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "9";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btn9.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == '~'){
                    System.out.println("Você apertou ~");
                    btnCinalTiu.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "~";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnCinalTiu.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == '´'){
                    System.out.println("Você apertou ´");
                    btnAcento.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "´";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnAcento.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_ADD){
                    System.out.println("Você apertou +");
                    btnCinalMais.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "+";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnCinalMais.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
                    System.out.println("Você apertou -");
                    btnCinalMenos.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "-";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnCinalMenos.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_SLASH){
                    System.out.println("Você apertou /");
                    btnCinalDiagonalDireita.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "/";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnCinalDiagonalDireita.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET){
                    System.out.println("Você apertou ]");
                    btnCochetesDireita.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "]";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnCochetesDireita.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET){
                    System.out.println("Você apertou [");
                    btnCochetesEsquerda.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "[";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnCochetesEsquerda.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == ':'){
                    System.out.println("Você apertou :");
                    btnDoisPontos.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += ":";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnDoisPontos.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == '?'){
                    System.out.println("Você apertou ?");
                    btnInterogação.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += "?";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnInterogação.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_PERIOD){
                    System.out.println("Você apertou .");
                    btnPonto.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += ".";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnPonto.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == ','){
                    System.out.println("Você apertou ,");
                    btnVirgula.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = txtArea.getText();
                    txt += ",";
                    txtArea.setText(txt);
                    Timer timer = new Timer(1000, (ActionEvent evt) -> {
                        btnVirgula.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e){
            
            }
            
            @Override
            public void keyTyped(KeyEvent e){
                
            }
        });
        setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTexto1 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        btnCinalTiu = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCinalMenos = new javax.swing.JButton();
        btnCinalMais = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnTab = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnCochetesEsquerda = new javax.swing.JButton();
        btnCochetesDireita = new javax.swing.JButton();
        btnCinalDiagonalDireita = new javax.swing.JButton();
        btnCaps = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnDoisPontos = new javax.swing.JButton();
        btnAcento = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        btnShist = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnInterogação = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnCetaCima = new javax.swing.JButton();
        btnCetaBaixo = new javax.swing.JButton();
        btnCetaDireita = new javax.swing.JButton();
        btnCetaEsquerda = new javax.swing.JButton();
        btnEspaço = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        lblTexto1.setBackground(new java.awt.Color(0, 0, 0));
        lblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto1.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");

        lblTexto2.setBackground(new java.awt.Color(0, 0, 0));
        lblTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto2.setText("Note. Cliking the buttons with your mouse will not perform any action.");

        btnCinalTiu.setBackground(new java.awt.Color(0, 0, 0));
        btnCinalTiu.setForeground(new java.awt.Color(255, 255, 255));
        btnCinalTiu.setText("~");
        btnCinalTiu.addActionListener(this::btnCinalTiuActionPerformed);

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");

        btnE.setBackground(new java.awt.Color(0, 0, 0));
        btnE.setForeground(new java.awt.Color(255, 255, 255));
        btnE.setText("E");
        btnE.addActionListener(this::btnEActionPerformed);

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");

        btnCinalMenos.setBackground(new java.awt.Color(0, 0, 0));
        btnCinalMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnCinalMenos.setText("-");

        btnCinalMais.setBackground(new java.awt.Color(0, 0, 0));
        btnCinalMais.setForeground(new java.awt.Color(255, 255, 255));
        btnCinalMais.setText("+");

        btnBackspace.setBackground(new java.awt.Color(0, 0, 0));
        btnBackspace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackspace.setText("Backspace");

        btnTab.setBackground(new java.awt.Color(0, 0, 0));
        btnTab.setForeground(new java.awt.Color(255, 255, 255));
        btnTab.setText("Tab");

        btnQ.setBackground(new java.awt.Color(0, 0, 0));
        btnQ.setForeground(new java.awt.Color(255, 255, 255));
        btnQ.setText("Q");

        btnW.setBackground(new java.awt.Color(0, 0, 0));
        btnW.setForeground(new java.awt.Color(255, 255, 255));
        btnW.setText("W");

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");

        btnR.setBackground(new java.awt.Color(0, 0, 0));
        btnR.setForeground(new java.awt.Color(255, 255, 255));
        btnR.setText("R");

        btnT.setBackground(new java.awt.Color(0, 0, 0));
        btnT.setForeground(new java.awt.Color(255, 255, 255));
        btnT.setText("T");

        btnY.setBackground(new java.awt.Color(0, 0, 0));
        btnY.setForeground(new java.awt.Color(255, 255, 255));
        btnY.setText("Y");

        btnU.setBackground(new java.awt.Color(0, 0, 0));
        btnU.setForeground(new java.awt.Color(255, 255, 255));
        btnU.setText("U");

        btnI.setBackground(new java.awt.Color(0, 0, 0));
        btnI.setForeground(new java.awt.Color(255, 255, 255));
        btnI.setText("I");
        btnI.addActionListener(this::btnIActionPerformed);

        btnO.setBackground(new java.awt.Color(0, 0, 0));
        btnO.setForeground(new java.awt.Color(255, 255, 255));
        btnO.setText("O");

        btnP.setBackground(new java.awt.Color(0, 0, 0));
        btnP.setForeground(new java.awt.Color(255, 255, 255));
        btnP.setText("P");
        btnP.addActionListener(this::btnPActionPerformed);

        btnCochetesEsquerda.setBackground(new java.awt.Color(0, 0, 0));
        btnCochetesEsquerda.setForeground(new java.awt.Color(255, 255, 255));
        btnCochetesEsquerda.setText("[");
        btnCochetesEsquerda.addActionListener(this::btnCochetesEsquerdaActionPerformed);

        btnCochetesDireita.setBackground(new java.awt.Color(0, 0, 0));
        btnCochetesDireita.setForeground(new java.awt.Color(255, 255, 255));
        btnCochetesDireita.setText("]");

        btnCinalDiagonalDireita.setBackground(new java.awt.Color(0, 0, 0));
        btnCinalDiagonalDireita.setForeground(new java.awt.Color(255, 255, 255));
        btnCinalDiagonalDireita.setText("/");

        btnCaps.setBackground(new java.awt.Color(0, 0, 0));
        btnCaps.setForeground(new java.awt.Color(255, 255, 255));
        btnCaps.setText("Caps");

        btnA.setBackground(new java.awt.Color(0, 0, 0));
        btnA.setForeground(new java.awt.Color(255, 255, 255));
        btnA.setText("A");

        btnS.setBackground(new java.awt.Color(0, 0, 0));
        btnS.setForeground(new java.awt.Color(255, 255, 255));
        btnS.setText("S");

        btnD.setBackground(new java.awt.Color(0, 0, 0));
        btnD.setForeground(new java.awt.Color(255, 255, 255));
        btnD.setText("D");

        btnF.setBackground(new java.awt.Color(0, 0, 0));
        btnF.setForeground(new java.awt.Color(255, 255, 255));
        btnF.setText("F");

        btnG.setBackground(new java.awt.Color(0, 0, 0));
        btnG.setForeground(new java.awt.Color(255, 255, 255));
        btnG.setText("G");

        btnH.setBackground(new java.awt.Color(0, 0, 0));
        btnH.setForeground(new java.awt.Color(255, 255, 255));
        btnH.setText("H");

        btnJ.setBackground(new java.awt.Color(0, 0, 0));
        btnJ.setForeground(new java.awt.Color(255, 255, 255));
        btnJ.setText("J");

        btnK.setBackground(new java.awt.Color(0, 0, 0));
        btnK.setForeground(new java.awt.Color(255, 255, 255));
        btnK.setText("K");

        btnL.setBackground(new java.awt.Color(0, 0, 0));
        btnL.setForeground(new java.awt.Color(255, 255, 255));
        btnL.setText("L");
        btnL.addActionListener(this::btnLActionPerformed);

        btnDoisPontos.setBackground(new java.awt.Color(0, 0, 0));
        btnDoisPontos.setForeground(new java.awt.Color(255, 255, 255));
        btnDoisPontos.setText(":");

        btnAcento.setBackground(new java.awt.Color(0, 0, 0));
        btnAcento.setForeground(new java.awt.Color(255, 255, 255));
        btnAcento.setText("´");

        btnEnter.setBackground(new java.awt.Color(0, 0, 0));
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");

        jButton42.setText("jButton42");

        btnShist.setBackground(new java.awt.Color(0, 0, 0));
        btnShist.setForeground(new java.awt.Color(255, 255, 255));
        btnShist.setText("Shist");

        btnZ.setBackground(new java.awt.Color(0, 0, 0));
        btnZ.setForeground(new java.awt.Color(255, 255, 255));
        btnZ.setText("Z");
        btnZ.addActionListener(this::btnZActionPerformed);

        btnX.setBackground(new java.awt.Color(0, 0, 0));
        btnX.setForeground(new java.awt.Color(255, 255, 255));
        btnX.setText("X");

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");

        btnV.setBackground(new java.awt.Color(0, 0, 0));
        btnV.setForeground(new java.awt.Color(255, 255, 255));
        btnV.setText("V");

        btnB.setBackground(new java.awt.Color(0, 0, 0));
        btnB.setForeground(new java.awt.Color(255, 255, 255));
        btnB.setText("B");

        btnVirgula.setBackground(new java.awt.Color(0, 0, 0));
        btnVirgula.setForeground(new java.awt.Color(255, 255, 255));
        btnVirgula.setText(",");

        btnN.setBackground(new java.awt.Color(0, 0, 0));
        btnN.setForeground(new java.awt.Color(255, 255, 255));
        btnN.setText("N");

        btnM.setBackground(new java.awt.Color(0, 0, 0));
        btnM.setForeground(new java.awt.Color(255, 255, 255));
        btnM.setText("M");

        btnPonto.setBackground(new java.awt.Color(0, 0, 0));
        btnPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnPonto.setText(".");

        btnInterogação.setBackground(new java.awt.Color(0, 0, 0));
        btnInterogação.setForeground(new java.awt.Color(255, 255, 255));
        btnInterogação.setText("?");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnCetaCima.setBackground(new java.awt.Color(0, 0, 0));
        btnCetaCima.setForeground(new java.awt.Color(255, 255, 255));
        btnCetaCima.setText("^");

        btnCetaBaixo.setBackground(new java.awt.Color(0, 0, 0));
        btnCetaBaixo.setForeground(new java.awt.Color(255, 255, 255));
        btnCetaBaixo.setText("v");

        btnCetaDireita.setBackground(new java.awt.Color(0, 0, 0));
        btnCetaDireita.setForeground(new java.awt.Color(255, 255, 255));
        btnCetaDireita.setText(">");

        btnCetaEsquerda.setBackground(new java.awt.Color(0, 0, 0));
        btnCetaEsquerda.setForeground(new java.awt.Color(255, 255, 255));
        btnCetaEsquerda.setText("<");

        btnEspaço.setBackground(new java.awt.Color(0, 0, 0));
        btnEspaço.setForeground(new java.awt.Color(255, 255, 255));
        btnEspaço.addActionListener(this::btnEspaçoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTexto1)
                        .addComponent(lblTexto2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTab, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnCochetesEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnCochetesDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnCinalDiagonalDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btnCetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnAcento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCinalTiu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnCinalMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnCinalMais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton42)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnShist, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnInterogação, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTexto1)
                .addGap(12, 12, 12)
                .addComponent(lblTexto2)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCinalTiu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCinalMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCinalMais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCochetesEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCochetesDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCinalDiagonalDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInterogação, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnEspaço, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        lblTexto1.getAccessibleContext().setAccessibleDescription("lblTexto1");
        btnCinalTiu.getAccessibleContext().setAccessibleName("btn~");
        btn1.getAccessibleContext().setAccessibleName("btn1");
        btnE.getAccessibleContext().setAccessibleName("btnE");
        btn3.getAccessibleContext().setAccessibleName("btn3");
        btn4.getAccessibleContext().setAccessibleName("btn4");
        btn5.getAccessibleContext().setAccessibleName("btn5");
        btn5.getAccessibleContext().setAccessibleDescription("");
        btn6.getAccessibleContext().setAccessibleName("btn6");
        btn7.getAccessibleContext().setAccessibleName("btn7");
        btn8.getAccessibleContext().setAccessibleName("btn8");
        btn9.getAccessibleContext().setAccessibleName("btn9");
        btn0.getAccessibleContext().setAccessibleName("btn0");
        btnCinalMenos.getAccessibleContext().setAccessibleName("btn-");
        btnCinalMais.getAccessibleContext().setAccessibleName("btn+");
        btnBackspace.getAccessibleContext().setAccessibleName("btnBackspace");
        btnTab.getAccessibleContext().setAccessibleName("btnTab");
        btnQ.getAccessibleContext().setAccessibleName("btnQ");
        btnW.getAccessibleContext().setAccessibleName("btnW");
        btn2.getAccessibleContext().setAccessibleName("btn2");
        btnR.getAccessibleContext().setAccessibleName("btnR");
        btnT.getAccessibleContext().setAccessibleName("btnT");
        btnY.getAccessibleContext().setAccessibleName("btnY");
        btnU.getAccessibleContext().setAccessibleName("btnU");
        btnI.getAccessibleContext().setAccessibleName("btnI");
        btnO.getAccessibleContext().setAccessibleName("btnO");
        btnP.getAccessibleContext().setAccessibleName("btnP");
        btnCochetesEsquerda.getAccessibleContext().setAccessibleName("btn[");
        btnCochetesDireita.getAccessibleContext().setAccessibleName("btn]");
        btnCinalDiagonalDireita.getAccessibleContext().setAccessibleName("btn/");
        btnCaps.getAccessibleContext().setAccessibleName("btnCaps");
        btnA.getAccessibleContext().setAccessibleName("btnA");
        btnS.getAccessibleContext().setAccessibleName("btnS");
        btnD.getAccessibleContext().setAccessibleName("btnD");
        btnF.getAccessibleContext().setAccessibleName("btnF");
        btnG.getAccessibleContext().setAccessibleName("btnG");
        btnH.getAccessibleContext().setAccessibleName("btnH");
        btnJ.getAccessibleContext().setAccessibleName("btnJ");
        btnK.getAccessibleContext().setAccessibleName("btnK");
        btnL.getAccessibleContext().setAccessibleName("btnL");
        btnDoisPontos.getAccessibleContext().setAccessibleName("btn:");
        btnAcento.getAccessibleContext().setAccessibleName("btn´");
        btnEnter.getAccessibleContext().setAccessibleName("btnEnter");
        btnShist.getAccessibleContext().setAccessibleName("btnShist");
        btnZ.getAccessibleContext().setAccessibleName("btnZ");
        btnX.getAccessibleContext().setAccessibleName("btnX");
        btnC.getAccessibleContext().setAccessibleName("btnC");
        btnV.getAccessibleContext().setAccessibleName("btnV");
        btnB.getAccessibleContext().setAccessibleName("btnB");
        btnVirgula.getAccessibleContext().setAccessibleName("btn,");
        btnN.getAccessibleContext().setAccessibleName("btnN");
        btnM.getAccessibleContext().setAccessibleName("btnM");
        btnPonto.getAccessibleContext().setAccessibleName("btn.");
        btnPonto.getAccessibleContext().setAccessibleDescription("");
        btnInterogação.getAccessibleContext().setAccessibleName("btn?");
        btnCetaCima.getAccessibleContext().setAccessibleName("btn^");
        btnCetaBaixo.getAccessibleContext().setAccessibleName("btnv");
        btnCetaDireita.getAccessibleContext().setAccessibleName("btn>");
        btnCetaDireita.getAccessibleContext().setAccessibleDescription("");
        btnCetaEsquerda.getAccessibleContext().setAccessibleName("btn<");
        btnEspaço.getAccessibleContext().setAccessibleName("btnEspaco");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIActionPerformed

    private void btnCinalTiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinalTiuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCinalTiuActionPerformed

    private void btnEspaçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspaçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspaçoActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLActionPerformed

    private void btnCochetesEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCochetesEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCochetesEsquerdaActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GanelaAv3().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAcento;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCaps;
    private javax.swing.JButton btnCetaBaixo;
    private javax.swing.JButton btnCetaCima;
    private javax.swing.JButton btnCetaDireita;
    private javax.swing.JButton btnCetaEsquerda;
    private javax.swing.JButton btnCinalDiagonalDireita;
    private javax.swing.JButton btnCinalMais;
    private javax.swing.JButton btnCinalMenos;
    private javax.swing.JButton btnCinalTiu;
    private javax.swing.JButton btnCochetesDireita;
    private javax.swing.JButton btnCochetesEsquerda;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDoisPontos;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEspaço;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnInterogação;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnShist;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnTab;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton jButton42;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
