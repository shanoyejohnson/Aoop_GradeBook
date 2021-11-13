package com.advancedoop.gradebook;



import java.awt.Color;
public class Calculator extends javax.swing.JFrame {
    
    double result=0,temp=0,input=0;
    String inputNumber = "", sign = "", op = "";
    boolean power = true;
    
    
    void power(){
        if(power){
            ac();
            power = false;
            jButtonOnOf.setBackground(Color.red);
        }
        else {
            power = true;
            jButtonOnOf.setBackground(Color.green);
        }
    }

    public void input(String s){
        
        if(power){
            if(s.equals("0") || s.equals("1")|| s.equals("2")|| s.equals("3")|| s.equals("4")|| s.equals("5")|| s.equals("6")|| s.equals("7")|| s.equals("8")|| s.equals("9")){
                jTextFieldInput.setText(jTextFieldInput.getText()+s);
                inputNumber+=s;
            }
            else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("=")){
                if(!inputNumber.equals("")){
                    tempCalculate();
                    Calculate();
                }
                jTextFieldSign.setText(s);
                jTextFieldInput.setText("");
                inputNumber = "";
                op = "";
                jTextFieldOP.setText("");
                jTextFieldOutput.setText(Double.toString(result));
                sign = s;
            }
        
            else if(s.equals("sqrt") || s.equals("squre") || s.equals("power") || s.equals("log") || s.equals("ln") || s.equals("%") || s.equals("*10^") || s.equals("sin^-") || s.equals("cos^-") || s.equals("tan^-") || s.equals("!") || s.equals("e^") || s.equals("sin")|| s.equals("cos") || s.equals("tan")){
                op = s;
                jTextFieldOP.setText(s);
            }   
        
            else if(s.equals("Ans")){
                inputNumber = Double.toString(result);
                jTextFieldInput.setText("Ans");
            }
        
        
            else if(s.equals(".")){
                if(!dotcheck()){
                    jTextFieldInput.setText(jTextFieldInput.getText()+s);
                    inputNumber+=s;
                }
            }
            
        }
        
    }
    
    
    
    void tempCalculate(){
        if(op.equals("sqrt")){
            input = Double.parseDouble(inputNumber);
            temp = Math.sqrt(input);
        }
        else if(op.equals("squre")){
            input = Double.parseDouble(inputNumber);
            temp = Math.pow(input, 2);
        }
        else if(op.equals("power")){
            input = Double.parseDouble(inputNumber);
            temp = Math.pow(result, input);
        }
        else if(op.equals("log")){
            input = Double.parseDouble(inputNumber);
            temp = Math.log10(input);
        }
        else if(op.equals("ln")){
            input = Double.parseDouble(inputNumber);
            temp = Math.log(input);
        }
        else if(op.equals("%")){
            input = Double.parseDouble(inputNumber);
            temp = input/100;
        }
        else if(op.equals("*10^")){
            input = Double.parseDouble(inputNumber);
            temp = Math.pow(10,input);
        }
        else if(op.equals("sin^-")){
            input = Double.parseDouble(inputNumber);
            temp = Math.asin(input);
        }
        else if(op.equals("cos^-")){
            input = Double.parseDouble(inputNumber);
            temp = Math.acos(input);
        }
        else if(op.equals("tan^-")){
            input = Double.parseDouble(inputNumber);
            temp = Math.atan(input);
        }
        else if(op.equals("!")){
            input = Double.parseDouble(inputNumber);
            temp = factorial((int)input);
        }
        else if(op.equals("e^")){
            input = Double.parseDouble(inputNumber);
            temp = Math.exp(input);
        }
        else if(op.equals("sin")){
            input = Double.parseDouble(inputNumber);
            temp = Math.sin(input);
        }
        else if(op.equals("cos")){
            input = Double.parseDouble(inputNumber);
            temp = Math.cos(input);
        }
        else if(op.equals("tan")){
            input = Double.parseDouble(inputNumber);
            temp = Math.tan(input);
        }
        else{
            temp = Double.parseDouble(inputNumber);
        }
    }
    
    
    void Calculate(){
        if(sign.equals("+")){
            result+=temp;
        }
        else if(sign.equals("-")){
            result-=temp;
        }
        else if(sign.equals("*")){
            result*=temp;
        }
        else if(sign.equals("/")){
            result/=temp;
        }
        
        else{
            result = temp;
        }
    }
    
    
    
    void ac(){
        result = 0;
        temp = 0;
        input = 0;
        inputNumber = "";
        sign = ""; 
        op = "";
        jTextFieldOutput.setText("");
        jTextFieldInput.setText("");
        jTextFieldSign.setText("");
        jTextFieldOP.setText("");
        
    }
    
    
    void del(){
        String s = jTextFieldInput.getText();
        if(s.length()>0){
            s = removeCharAt(s,s.length()-1);
            jTextFieldInput.setText(s);
        }
        if(inputNumber.length()>0){
            inputNumber = removeCharAt(inputNumber,inputNumber.length()-1);
            
        }
        
    }
    
    
    boolean dotcheck(){
        String str = jTextFieldInput.getText();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='.'){
                return true;
            }
        }
        return false;
    }
    
    long factorial(int N)
    {
        long multi = 1;
        for (int i = 1; i <= N; i++) {
            multi = multi * i;
        }
        return multi;
    }
    
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldInput = new javax.swing.JTextField();
        jButton0 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButton10X = new javax.swing.JButton();
        jButtonAns = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMul = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonAc = new javax.swing.JButton();
        jButtonSqrt = new javax.swing.JButton();
        jButtonSqr = new javax.swing.JButton();
        jButtonPs = new javax.swing.JButton();
        jButtonEtoP = new javax.swing.JButton();
        jButtonPower = new javax.swing.JButton();
        jButtonLog = new javax.swing.JButton();
        jButtonSinI = new javax.swing.JButton();
        jButtonCosI = new javax.swing.JButton();
        jButtonSin = new javax.swing.JButton();
        jButtonCos = new javax.swing.JButton();
        jButtonLn = new javax.swing.JButton();
        jButtonTanI = new javax.swing.JButton();
        jButtonTan = new javax.swing.JButton();
        jButtonFact = new javax.swing.JButton();
        jButtonOnOf = new javax.swing.JButton();
        jTextFieldOutput = new javax.swing.JTextField();
        jTextFieldSign = new javax.swing.JTextField();
        jTextFieldOP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setResizable(false);

        jTextFieldInput.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jTextFieldInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.setToolTipText("");
        jButton0.setAlignmentX(0.5F);
        jButton0.setAutoscrolls(true);
        jButton0.setBorderPainted(false);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonDot.setText(".");
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        jButton10X.setText("x10^");
        jButton10X.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton10X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10XActionPerformed(evt);
            }
        });

        jButtonAns.setText("Ans");
        jButtonAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnsActionPerformed(evt);
            }
        });

        jButtonEqual.setText("=");
        jButtonEqual.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.setToolTipText("");
        jButton1.setAlignmentX(0.5F);
        jButton1.setAutoscrolls(true);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setToolTipText("");
        jButton2.setAlignmentX(0.5F);
        jButton2.setAutoscrolls(true);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setToolTipText("");
        jButton3.setAlignmentX(0.5F);
        jButton3.setAutoscrolls(true);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonPlus.setText("+");
        jButtonPlus.setToolTipText("");
        jButtonPlus.setAlignmentX(0.5F);
        jButtonPlus.setAutoscrolls(true);
        jButtonPlus.setBorderPainted(false);
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonMinus.setText("-");
        jButtonMinus.setToolTipText("");
        jButtonMinus.setAlignmentX(0.5F);
        jButtonMinus.setAutoscrolls(true);
        jButtonMinus.setBorderPainted(false);
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setToolTipText("");
        jButton4.setAlignmentX(0.5F);
        jButton4.setAutoscrolls(true);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setToolTipText("");
        jButton5.setAlignmentX(0.5F);
        jButton5.setAutoscrolls(true);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setToolTipText("");
        jButton6.setAlignmentX(0.5F);
        jButton6.setAutoscrolls(true);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonMul.setText("x");
        jButtonMul.setToolTipText("");
        jButtonMul.setAlignmentX(0.5F);
        jButtonMul.setAutoscrolls(true);
        jButtonMul.setBorderPainted(false);
        jButtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMulActionPerformed(evt);
            }
        });

        jButtonDiv.setText("/");
        jButtonDiv.setToolTipText("");
        jButtonDiv.setAlignmentX(0.5F);
        jButtonDiv.setAutoscrolls(true);
        jButtonDiv.setBorderPainted(false);
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setToolTipText("");
        jButton7.setAlignmentX(0.5F);
        jButton7.setAutoscrolls(true);
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setToolTipText("");
        jButton8.setAlignmentX(0.5F);
        jButton8.setAutoscrolls(true);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setToolTipText("");
        jButton9.setAlignmentX(0.5F);
        jButton9.setAutoscrolls(true);
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonDel.setText("DEL");
        jButtonDel.setToolTipText("");
        jButtonDel.setAlignmentX(0.5F);
        jButtonDel.setAutoscrolls(true);
        jButtonDel.setBorderPainted(false);
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonAc.setText("AC");
        jButtonAc.setToolTipText("");
        jButtonAc.setAlignmentX(0.5F);
        jButtonAc.setAutoscrolls(true);
        jButtonAc.setBorderPainted(false);
        jButtonAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcActionPerformed(evt);
            }
        });

        jButtonSqrt.setText("sqrt");
        jButtonSqrt.setToolTipText("");
        jButtonSqrt.setAlignmentX(0.5F);
        jButtonSqrt.setAutoscrolls(true);
        jButtonSqrt.setBorderPainted(false);
        jButtonSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSqrtActionPerformed(evt);
            }
        });

        jButtonSqr.setText("x^2");
        jButtonSqr.setToolTipText("");
        jButtonSqr.setAlignmentX(0.5F);
        jButtonSqr.setAutoscrolls(true);
        jButtonSqr.setBorderPainted(false);
        jButtonSqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSqrActionPerformed(evt);
            }
        });

        jButtonPs.setText("%");
        jButtonPs.setToolTipText("");
        jButtonPs.setAlignmentX(0.5F);
        jButtonPs.setAutoscrolls(true);
        jButtonPs.setBorderPainted(false);
        jButtonPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPsActionPerformed(evt);
            }
        });

        jButtonEtoP.setText("e^");
        jButtonEtoP.setToolTipText("");
        jButtonEtoP.setAlignmentX(0.5F);
        jButtonEtoP.setAutoscrolls(true);
        jButtonEtoP.setBorderPainted(false);
        jButtonEtoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEtoPActionPerformed(evt);
            }
        });

        jButtonPower.setText("x^");
        jButtonPower.setToolTipText("");
        jButtonPower.setAlignmentX(0.5F);
        jButtonPower.setAutoscrolls(true);
        jButtonPower.setBorderPainted(false);
        jButtonPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPowerActionPerformed(evt);
            }
        });

        jButtonLog.setText("log");
        jButtonLog.setToolTipText("");
        jButtonLog.setAlignmentX(0.5F);
        jButtonLog.setAutoscrolls(true);
        jButtonLog.setBorderPainted(false);
        jButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogActionPerformed(evt);
            }
        });

        jButtonSinI.setText("sin^-");
        jButtonSinI.setToolTipText("");
        jButtonSinI.setAlignmentX(0.5F);
        jButtonSinI.setAutoscrolls(true);
        jButtonSinI.setBorderPainted(false);
        jButtonSinI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinIActionPerformed(evt);
            }
        });

        jButtonCosI.setText("cos^-");
        jButtonCosI.setToolTipText("");
        jButtonCosI.setAlignmentX(0.5F);
        jButtonCosI.setAutoscrolls(true);
        jButtonCosI.setBorderPainted(false);
        jButtonCosI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCosIActionPerformed(evt);
            }
        });

        jButtonSin.setText("sin");
        jButtonSin.setToolTipText("");
        jButtonSin.setAlignmentX(0.5F);
        jButtonSin.setAutoscrolls(true);
        jButtonSin.setBorderPainted(false);
        jButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinActionPerformed(evt);
            }
        });

        jButtonCos.setText("cos");
        jButtonCos.setToolTipText("");
        jButtonCos.setAlignmentX(0.5F);
        jButtonCos.setAutoscrolls(true);
        jButtonCos.setBorderPainted(false);
        jButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCosActionPerformed(evt);
            }
        });

        jButtonLn.setText("ln");
        jButtonLn.setToolTipText("");
        jButtonLn.setAlignmentX(0.5F);
        jButtonLn.setAutoscrolls(true);
        jButtonLn.setBorderPainted(false);
        jButtonLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLnActionPerformed(evt);
            }
        });

        jButtonTanI.setText("tan^-");
        jButtonTanI.setToolTipText("");
        jButtonTanI.setAlignmentX(0.5F);
        jButtonTanI.setAutoscrolls(true);
        jButtonTanI.setBorderPainted(false);
        jButtonTanI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanIActionPerformed(evt);
            }
        });

        jButtonTan.setText("tan");
        jButtonTan.setToolTipText("");
        jButtonTan.setAlignmentX(0.5F);
        jButtonTan.setAutoscrolls(true);
        jButtonTan.setBorderPainted(false);
        jButtonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanActionPerformed(evt);
            }
        });

        jButtonFact.setText("x!");
        jButtonFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactActionPerformed(evt);
            }
        });

        jButtonOnOf.setBackground(java.awt.Color.green);
        jButtonOnOf.setText("ON / OFF");
        jButtonOnOf.setToolTipText("");
        jButtonOnOf.setAlignmentX(0.5F);
        jButtonOnOf.setAutoscrolls(true);
        jButtonOnOf.setBorderPainted(false);
        jButtonOnOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOnOfActionPerformed(evt);
            }
        });

        jTextFieldOutput.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jTextFieldOutput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOutputActionPerformed(evt);
            }
        });

        jTextFieldSign.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jTextFieldSign.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldOP.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jTextFieldOP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAns, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSqrt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSqr))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonFact)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonEtoP)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonSin)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonCos))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonDel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButtonSinI)
                                                    .addComponent(jButtonPower))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButtonLog)
                                                    .addComponent(jButtonCosI)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonPs)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton10X, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonAc)
                                            .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonTanI)
                                            .addComponent(jButtonTan)
                                            .addComponent(jButtonLn))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jTextFieldInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldOP)
                            .addComponent(jTextFieldSign)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonOnOf, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0, jButton1, jButton10X, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonAc, jButtonAns, jButtonCos, jButtonCosI, jButtonDel, jButtonDiv, jButtonDot, jButtonEtoP, jButtonFact, jButtonLn, jButtonLog, jButtonMinus, jButtonMul, jButtonPlus, jButtonPower, jButtonPs, jButtonSin, jButtonSinI, jButtonSqr, jButtonSqrt, jButtonTan, jButtonTanI});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSign, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonOnOf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSqrt)
                    .addComponent(jButtonSqr)
                    .addComponent(jButtonLn)
                    .addComponent(jButtonLog)
                    .addComponent(jButtonPower))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPs)
                    .addComponent(jButtonSinI)
                    .addComponent(jButtonCosI)
                    .addComponent(jButtonTanI)
                    .addComponent(jButton10X))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFact)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSin)
                        .addComponent(jButtonCos)
                        .addComponent(jButtonTan)
                        .addComponent(jButtonEtoP)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButtonDel)
                    .addComponent(jButtonAc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButtonMul)
                    .addComponent(jButtonDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButtonPlus)
                    .addComponent(jButtonMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(jButtonDot)
                    .addComponent(jButtonAns)
                    .addComponent(jButtonEqual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton0, jButton1, jButton10X, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonAc, jButtonAns, jButtonCos, jButtonCosI, jButtonDel, jButtonDiv, jButtonDot, jButtonEqual, jButtonEtoP, jButtonFact, jButtonLn, jButtonLog, jButtonMinus, jButtonMul, jButtonPlus, jButtonPower, jButtonPs, jButtonSin, jButtonSinI, jButtonSqr, jButtonSqrt, jButtonTan, jButtonTanI});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInputActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        input("0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        input("=");
    }//GEN-LAST:event_jButtonEqualActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        input("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        input("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        input("3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        input("+");
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        input("-");
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        input("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        input("5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        input("6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMulActionPerformed
        input("*");
    }//GEN-LAST:event_jButtonMulActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        input("/");
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        input("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        input("8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        input("9");
    }//GEN-LAST:event_jButton9ActionPerformed
    
    
    
    
    //Delete char from string
    public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
    
    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        del();
        
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcActionPerformed
        ac();
    }//GEN-LAST:event_jButtonAcActionPerformed

    private void jButtonSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSqrtActionPerformed
        input("sqrt");
    }//GEN-LAST:event_jButtonSqrtActionPerformed

    private void jButtonSqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSqrActionPerformed
        input("squre");
    }//GEN-LAST:event_jButtonSqrActionPerformed

    private void jButtonPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPsActionPerformed
        input("%");
    }//GEN-LAST:event_jButtonPsActionPerformed

    private void jButtonEtoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEtoPActionPerformed
        input("e^");
    }//GEN-LAST:event_jButtonEtoPActionPerformed

    private void jButtonPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPowerActionPerformed
        input("power");
    }//GEN-LAST:event_jButtonPowerActionPerformed

    private void jButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogActionPerformed
        input("log");
    }//GEN-LAST:event_jButtonLogActionPerformed

    private void jButtonSinIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinIActionPerformed
        input("sin^-");
    }//GEN-LAST:event_jButtonSinIActionPerformed

    private void jButtonCosIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCosIActionPerformed
        input("cos^-");
    }//GEN-LAST:event_jButtonCosIActionPerformed

    private void jButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinActionPerformed
        input("sin");
    }//GEN-LAST:event_jButtonSinActionPerformed

    private void jButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCosActionPerformed
        input("cos");
    }//GEN-LAST:event_jButtonCosActionPerformed

    private void jButtonLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLnActionPerformed
        input("ln");
    }//GEN-LAST:event_jButtonLnActionPerformed

    private void jButtonTanIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanIActionPerformed
        input("tan^-");
    }//GEN-LAST:event_jButtonTanIActionPerformed

    private void jButtonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanActionPerformed
        input("tan");
    }//GEN-LAST:event_jButtonTanActionPerformed

    private void jButtonOnOfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOnOfActionPerformed
        power();
    }//GEN-LAST:event_jButtonOnOfActionPerformed

    private void jTextFieldOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOutputActionPerformed

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotActionPerformed
        input(".");
    }//GEN-LAST:event_jButtonDotActionPerformed

    private void jButton10XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10XActionPerformed
        input("*10^");
    }//GEN-LAST:event_jButton10XActionPerformed

    private void jButtonAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnsActionPerformed
        input("Ans");
    }//GEN-LAST:event_jButtonAnsActionPerformed

    private void jButtonFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFactActionPerformed
        input("!");
    }//GEN-LAST:event_jButtonFactActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10X;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAc;
    private javax.swing.JButton jButtonAns;
    private javax.swing.JButton jButtonCos;
    private javax.swing.JButton jButtonCosI;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonEtoP;
    private javax.swing.JButton jButtonFact;
    private javax.swing.JButton jButtonLn;
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMul;
    private javax.swing.JButton jButtonOnOf;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPower;
    private javax.swing.JButton jButtonPs;
    private javax.swing.JButton jButtonSin;
    private javax.swing.JButton jButtonSinI;
    private javax.swing.JButton jButtonSqr;
    private javax.swing.JButton jButtonSqrt;
    private javax.swing.JButton jButtonTan;
    private javax.swing.JButton jButtonTanI;
    private javax.swing.JTextField jTextFieldInput;
    private javax.swing.JTextField jTextFieldOP;
    private javax.swing.JTextField jTextFieldOutput;
    private javax.swing.JTextField jTextFieldSign;
    // End of variables declaration//GEN-END:variables
}