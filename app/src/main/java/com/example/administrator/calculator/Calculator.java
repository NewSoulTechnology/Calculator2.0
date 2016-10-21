package com.example.administrator.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Stack;
/**
 * Created by Administrator on 2016/9/29.
 */
public class Calculator extends Activity implements View.OnClickListener {
    //定义界面中的按钮
    Button button_0, button_1, button_2, button_3, button_4, button_5,
            button_6, button_7, button_8, button_9, button_point, button_add,
            button_min, button_mul, button_div, button_c, button_ce, button_equal,
            button_tob, button_too, button_toh, button_bracket;
    //输入文本框
    EditText text_1;
    //结果显示文本框
    TextView text_2;
    //后缀式栈
    private Stack<String> postfixStack  = new Stack<String>();
    //运算符栈
    private Stack<Character> opStack  = new Stack<Character>();
    //运用运算符ASCII码-40做索引的运算符优先级
    private int [] operatPriority  = new int[] {0,3,2,1,-1,1,0,2};
    //判断是否已经计算
    boolean iscalculat=false;
    //判断是否已经进行进制转换
    boolean sign=false;
    //是否输入小数点
    boolean point=false;
    //判断左括号
    boolean isleftbracket=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.calculator_layout);
        init();
    }
    protected void init() {
        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_point = (Button) findViewById(R.id.button_point);
        button_add = (Button) findViewById(R.id.button_add);
        button_min = (Button) findViewById(R.id.button_min);
        button_mul = (Button) findViewById(R.id.button_mul);
        button_div = (Button) findViewById(R.id.button_div);
        button_c = (Button) findViewById(R.id.button_c);
        button_ce = (Button) findViewById(R.id.button_ce);
        button_equal = (Button) findViewById(R.id.button_equal);
        button_tob = (Button) findViewById(R.id.button_tob);
        button_too = (Button) findViewById(R.id.button_too);
        button_toh = (Button) findViewById(R.id.button_toh);
        button_bracket = (Button) findViewById(R.id.button_bracket);
        text_1 = (EditText) findViewById(R.id.text_1);
        text_2 = (TextView) findViewById(R.id.text_2);
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_min.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_c.setOnClickListener(this);
        button_ce.setOnClickListener(this);
        button_equal.setOnClickListener(this);
        button_tob.setOnClickListener(this);
        button_too.setOnClickListener(this);
        button_toh.setOnClickListener(this);
        button_bracket.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"0");
                text_2.setHint("");
            }break;
            case R.id.button_1:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"1");
                text_2.setHint("");
            }break;
            case R.id.button_2:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"2");
                text_2.setHint("");
            }break;
            case R.id.button_3:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"3");
                text_2.setHint("");
            }break;
            case R.id.button_4:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"4");
                text_2.setHint("");
            }break;
            case R.id.button_5:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"5");
                text_2.setHint("");
            }break;
            case R.id.button_6:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"6");
                text_2.setHint("");
            }break;
            case R.id.button_7:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"7");
                text_2.setHint("");
            }break;
            case R.id.button_8:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"8");
                text_2.setHint("");
            }break;
            case R.id.button_9:{
                if(iscalculat==true)
                {
                    text_1.setText("");
                    iscalculat=false;
                }
                text_1.setText(text_1.getText()+"9");
                text_2.setHint("");
            }break;
            case R.id.button_point:{
                if(text_1.getText().toString()==null||text_1.getText().toString().length()==0) {
                    text_1.setText("0.");point=true;}
                else {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '+' && temp != '-' && temp != '*' && temp != '/' && temp != '.'&& temp != '(') {
                        if(point==false) {
                            text_1.setText(text_1.getText() + ".");
                            point = true;
                        }
                        else {
                            text_1.setText(text_1.getText());
                        }
                    } else
                        text_1.setText(text_1.getText());
                }
            }break;
            case R.id.button_add:{
                if(text_1.getText().toString()==null||text_1.getText().toString().length()==0)
                text_1.setText(text_1.getText());
                else {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '+' && temp != '-' && temp != '*' && temp != '/' && temp != '.'&& temp != '(') {
                        if(iscalculat==false) {
                            text_1.setText(text_1.getText() + "+");point=false;
                        }
                        else {
                            text_1.setText(text_2.getText().toString().substring(1) + "+");
                            iscalculat=false;point=false;
                        }
                    } else
                        text_1.setText(text_1.getText());
                }
            }break;
            case R.id.button_min:{
                if(text_1.getText().toString()==null||text_1.getText().toString().length()==0)
                    text_1.setText(text_1.getText());
                else {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '+' && temp != '-' && temp != '*' && temp != '/' && temp != '.'&& temp != '(') {
                        if(iscalculat==false) {
                            text_1.setText(text_1.getText() + "-");point=false;
                        }
                        else {
                            text_1.setText(text_2.getText().toString().substring(1) + "-");
                            iscalculat=false;point=false;
                        }
                    } else
                        text_1.setText(text_1.getText());
                }
            }break;
            case R.id.button_mul:{
                if(text_1.getText().toString()==null||text_1.getText().toString().length()==0)
                    text_1.setText(text_1.getText());
                else {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '+' && temp != '-' && temp != '*' && temp != '/' && temp != '.'&& temp != '(') {
                        if(iscalculat==false) {
                            text_1.setText(text_1.getText() + "*");point=false;
                        }
                        else {
                            text_1.setText(text_2.getText().toString().substring(1) + "*");
                            iscalculat=false;point=false;
                        }
                    } else
                        text_1.setText(text_1.getText());
                }
            }break;
            case R.id.button_div:{
                if(text_1.getText().toString()==null||text_1.getText().toString().length()==0)
                    text_1.setText(text_1.getText());
                else {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '+' && temp != '-' && temp != '*' && temp != '/' && temp != '.'&& temp != '(') {
                        if(iscalculat==false) {
                            text_1.setText(text_1.getText() + "/");point=false;
                        }
                        else {
                            text_1.setText(text_2.getText().toString().substring(1) + "/");
                            iscalculat=false;point=false;
                        }
                    } else
                        text_1.setText(text_1.getText());
                }
            }break;
            case R.id.button_bracket:{
                if(isleftbracket==false) {
                    if (text_1.getText().toString() == null || text_1.getText().toString().length() == 0) {
                        text_1.setText(text_1.getText().toString() + "(");
                        isleftbracket = true;
                    } else {
                        char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                        if (temp != '.'&&temp != '+'&&temp != '-'&&temp != '*'&&temp != '/') {
                            text_1.setText(text_1.getText().toString() + "*(");isleftbracket = true;
                        }
                        else
                        {text_1.setText(text_1.getText().toString() + "(");
                        isleftbracket = true;}
                    }
                }
                else
                {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '.'&&temp != '+'&&temp != '-'&&temp != '*'&&temp != '/') {
                        text_1.setText(text_1.getText().toString() + ")");
                        isleftbracket = false;
                    }
                    else
                        text_1.setText(text_1.getText().toString());
                }
            }break;
            case R.id.button_c:{
                if(text_1.getText().toString().length()!=0||text_1.getText().toString()!=null) {
                    if (iscalculat == false&&sign==false) {
                        //获取当前长度
                        int length = text_1.getText().toString().length();
                        if(length>0)
                        //清除1位
                                text_1.setText(text_1.getText().toString().substring(0, length - 1));
                        else
                            text_1.setText("");
                    } else {
                        //全部清除，同时将iscalculat标志回置
                        text_1.setText("");
                        text_2.setText("");
                        text_2.setHint("0.0");
                        iscalculat = false;
                        sign=false;
                        point=false;
                    }
                }
                else
                {
                    text_1.setText("");
                    text_2.setText("");
                    text_2.setHint("0.0");
                }
            }break;
            case R.id.button_ce:{
                text_1.setText("");
                text_2.setText("");
                text_2.setHint("0.0");
                iscalculat=false;
                sign=false;
            }break;
            case R.id.button_tob:{
                if(text_1.getText().toString().contains("+")||text_1.getText().toString().contains("-")||
                        text_1.getText().toString().contains("*")||text_1.getText().toString().contains("/"))
                    Toast.makeText(this,"表达式不能进行进制转换！",Toast.LENGTH_SHORT).show();
                else
                DtoB();
            }break;
            case R.id.button_too:{
                if(text_1.getText().toString().contains("+")||text_1.getText().toString().contains("-")||
                        text_1.getText().toString().contains("*")||text_1.getText().toString().contains("/"))
                    Toast.makeText(this,"表达式不能进行进制转换！",Toast.LENGTH_SHORT).show();
                else
                    DtoO();
            }break;
            case R.id.button_toh:{
                if(text_1.getText().toString().contains("+")||text_1.getText().toString().contains("-")||
                        text_1.getText().toString().contains("*")||text_1.getText().toString().contains("/"))
                    Toast.makeText(this,"表达式不能进行进制转换！",Toast.LENGTH_SHORT).show();
                else
                    DtoH();
            }break;
            case R.id.button_equal:{
                if(text_1.getText().toString()==null||text_1.getText().toString().length()==0)
                    text_1.setText("");
                else {
                    char temp = text_1.getText().toString().charAt(text_1.getText().toString().length() - 1);
                    if (temp != '+' && temp != '-' && temp != '*' && temp != '/' && temp != '.'&& temp != '(') {
                        double result = calculate(text_1.getText().toString());
                        text_2.setText("=" + result + "");
                        iscalculat = true;
                    }
                    else
                    {
                        text_1.setText(text_1.getText());
                    }
                }
            }break;
        }
    }
    //判断小数点是否存在，若存在返回true,不存在返回false,字符串为空则直接返回false
    private boolean ishaspoint()
    {
            for (int i = 0; i < text_1.getText().toString().length(); i++) {
                if (text_1.getText().toString().charAt(i) == '.') {
                    return true;
                }
            }
            return false;
    }
    //十进制转二进制
    public void DtoB()
    {//文本不为空，判断是否有小数点
        if(text_1.getText().toString()!=null&&!text_1.getText().toString().equals("")){
            ishaspoint();
            String temp;
            if(ishaspoint()==false)
            {//没有小数点，直接转换
                int n=Integer.parseInt(text_1.getText().toString());
                temp=Integer.toBinaryString(n);
                text_2.setText(temp);
            }
            else {//有小数点
                int local_point = 0;//存小数点位置
                //循环找小数点位置
                for (int i = 0; i < text_1.getText().toString().length(); i++) {
                    if (text_1.getText().toString().charAt(i) == '.') {
                        local_point = i;
                        break;
                    }
                }
                //截取整数部分
                int number_1 = Integer.parseInt(text_1.getText().toString().substring(0, local_point));
                //截取小数部分
                double number_2 = Double.parseDouble("0." + text_1.getText().toString().substring(local_point + 1, text_1.getText().toString().length()));
                int count_i = 0;//控制小数部分一直不为整的情况
                String temp_1;//整数部分转换
                temp_1=Integer.toBinaryString(number_1);
                char []array_1=temp_1.toCharArray();
                char []array_2=new char[8];
                String translate;
                //小数部分，循环乘2，存乘积的整数部分
                while (number_2 != 1 && count_i < 8) {
                    number_2 = number_2 * 2;
                    if(number_2>=(int)number_2)
                        switch ((int)number_2)
                        {
                            case 0:
                            case 1:{
                                translate=String.valueOf((int)number_2);
                                array_2[count_i]=translate.charAt(0);
                            }
                        }
                    number_2=number_2-(int)number_2;
                    count_i++;
                }
                //多定义一个存储空间用于存放小数点
                char []array=new char[temp_1.length()+count_i+1];
                for(int m=0;m<temp_1.length()+count_i+1;m++)
                {
                    //将整数部分存在数组array中
                    if(m<temp_1.length())
                        array[m]=array_1[m];
                    //将小数点存在数组array中
                    if(m==temp_1.length())
                        array[m]='.';
                    //将小数部分存在数组array中
                    if(m>temp_1.length())
                        array[m]=array_2[m-temp_1.length()-1];
                }
                text_2.setText(String.valueOf(array));
            }
            //用于表示已进行进制转换，便于回退键的对应操作
            sign=true;
        }
        else
        {//文本为空，不进行操作
            text_1.setText("");
        }
    }
    //十进制转八进制
    public void DtoO()
    {
        if(text_1.getText().toString()!=null&&!text_1.getText().toString().equals("")) {
            ishaspoint();
            String temp;
            if (ishaspoint() == false) {
                int n = Integer.parseInt(text_1.getText().toString());
                temp = Integer.toOctalString(n);
                text_2.setText(temp);
            }  else {
                int local_point = 0;//存小数点位置
                for (int i = 0; i < text_1.getText().toString().length(); i++) {
                    if (text_1.getText().toString().charAt(i) == '.') {
                        local_point = i;
                        break;
                    }
                }
                int number_1 = Integer.parseInt(text_1.getText().toString().substring(0, local_point));//截取整数部分
                double number_2 = Double.parseDouble("0." + text_1.getText().toString().substring(local_point + 1, text_1.getText().toString().length()));//截取小数部分
                int count_i = 0;//控制小数不能乘尽的情况
                //整数部分，循环除8，存余数
                String temp_1;//整数部分
                temp_1=Integer.toOctalString(number_1);
                char []array_1=temp_1.toCharArray();
                char []array_2=new char[8];
                String translate;
                //小数部分，循环乘8，存乘积的整数部分
                while (number_2 != 1 &&number_2 != 2&&number_2 != 3&&number_2 != 4&&number_2 != 5&&number_2 != 6
                        &&number_2 != 7&& count_i < 8) {
                    number_2 = number_2 * 8;
                    if(number_2>=(int)number_2)
                        switch ((int)number_2)
                        {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:{
                                translate=String.valueOf((int)number_2);
                                array_2[count_i]=translate.charAt(0);
                            }
                        }
                    number_2=number_2-(int)number_2;
                    count_i++;
                }
                char []array=new char[temp_1.length()+count_i+1];
                for(int m=0;m<temp_1.length()+count_i+1;m++)
                {
                    if(m<temp_1.length())
                        array[m]=array_1[m];
                    if(m==temp_1.length())
                        array[m]='.';
                    if(m>temp_1.length())
                        array[m]=array_2[m-temp_1.length()-1];
                }
                text_2.setText(String.valueOf(array));
            }
            sign=true;
        }
        else
        {
            text_1.setText("");
        }
    }
    //十进制转十六进制
    public void DtoH()
    {
        if(text_1.getText().toString()!=null&&!text_1.getText().toString().equals("")) {
            ishaspoint();
            String temp;
            if (ishaspoint() == false)//输入没得小数点
            {
                int n = Integer.parseInt(text_1.getText().toString());
                temp = Integer.toHexString(n).toUpperCase();
                text_2.setText(temp);
            } else {
                int local_point = 0;//存小数点位置
                for (int i = 0; i < text_1.getText().toString().length(); i++) {
                    if (text_1.getText().toString().charAt(i) == '.') {
                        local_point = i;
                        break;
                    }
                }
                int number_1 = Integer.parseInt(text_1.getText().toString().substring(0, local_point));//截取整数部分
                double number_2 = Double.parseDouble("0." + text_1.getText().toString().substring(local_point + 1, text_1.getText().toString().length()));//截取小数部分
                int count_i = 0;//控制小数不能乘尽的情况
                //整数部分，循环除16，存余数
                String temp_1;//整数部分
                temp_1=Integer.toHexString(number_1).toUpperCase();
                char []array_1=temp_1.toCharArray();
                char []array_2=new char[8];
                String translate;
                //小数部分，循环乘16，存乘积的整数部分
                while (number_2 != 1 &&number_2 != 2&&number_2 != 3&&number_2 != 4&&number_2 != 5&&number_2 != 6
                        &&number_2 != 7&&number_2 != 8&&number_2 != 9&&number_2 != 10&&number_2 != 11&&number_2 != 12
                        &&number_2 != 13&&number_2 != 14&&number_2 != 15&&number_2 != 16&& count_i < 8) {
                    number_2 = number_2 * 16;
                    if(number_2>=(int)number_2) {
                        switch ((int)number_2)
                        {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9: {
                                translate=String.valueOf((int)number_2);
                                array_2[count_i] = translate.charAt(0);
                            }break;
                            case 10:array_2[count_i] = 'A';break;
                            case 11:array_2[count_i] = 'B';break;
                            case 12:array_2[count_i] = 'C';break;
                            case 13:array_2[count_i] = 'D';break;
                            case 14:array_2[count_i] = 'E';break;
                            case 15:array_2[count_i] = 'F';break;
                        }
                        number_2 = number_2-(int)number_2;
                    }
                    else if(number_2>0&&number_2<1)
                        array_2[count_i] = '0';
                    else
                        break;
                    count_i++;
                }
                char []array=new char[temp_1.length()+count_i+1];
                for(int m=0;m<temp_1.length()+count_i+1;m++)
                {
                    if(m<temp_1.length())
                        array[m]=array_1[m];
                    if(m==temp_1.length())
                        array[m]='.';
                    if(m>temp_1.length())
                        array[m]=array_2[m-temp_1.length()-1];
                }
                text_2.setText(String.valueOf(array));
            }
            sign=true;
        }
        else
        {
            text_1.setText("");
        }
    }
    public double calculate(String expression) {
        Stack<String> resultStack  = new Stack<String>();
        prepare(expression);
        Collections.reverse(postfixStack);//将后缀式栈反转
        String firstValue  ,secondValue,currentValue;//参与计算的第一个值，第二个值和算术运算符
        while(!postfixStack.isEmpty()) {
            currentValue  = postfixStack.pop();
            if(!isOperator(currentValue.charAt(0))) {//如果不是运算符则存入操作数栈中
                resultStack.push(currentValue);
            } else {//如果是运算符则从操作数栈中取两个值和该数值一起参与运算
                secondValue  = resultStack.pop();
                firstValue  = resultStack.pop();
                String tempResult  = calculate(firstValue, secondValue, currentValue.charAt(0));
                resultStack.push(tempResult);}
        }
        return Double.valueOf(resultStack.pop());
    }
    //将表达式转换成为后缀式栈
    private void prepare(String expression) {
        opStack.push(',');//运算符放入栈底元素逗号，此符号优先级最低
        char[] arr  = expression.toCharArray();
        int currentIndex  = 0;//当前字符的位置
        int count = 0;//上次算术运算符到本次算术运算符的字符的长度便于或者之间的数值
        char currentOp  ,peekOp;//当前操作符和栈顶操作符
        for(int i=0;i<arr.length;i++) {
            currentOp = arr[i];
            if(isOperator(currentOp)) {//如果当前字符是运算符
                if(count > 0) {
                    postfixStack.push(new String(arr,currentIndex,count));//取两个运算符之间的数字
                }
                peekOp = opStack.peek();
                if(currentOp == ')') {//遇到反括号则将运算符栈中的元素移除到后缀式栈中直到遇到左括号
                    while(opStack.peek() != '(') {
                        postfixStack.push(String.valueOf(opStack.pop()));
                    }
                    opStack.pop();
                } else {
                    while(currentOp != '(' && peekOp != ',' && compare(currentOp,peekOp) ) {
                        postfixStack.push(String.valueOf(opStack.pop()));
                        peekOp = opStack.peek();
                    }
                    opStack.push(currentOp);
                }
                count = 0;
                currentIndex = i+1;
            } else {
                count++;
            }
        }
        if(count > 1 || (count == 1 && !isOperator(arr[currentIndex]))) {//最后一个字符不是括号或者其他运算符的则加入后缀式栈中
            postfixStack.push(new String(arr,currentIndex,count));
        }

        while(opStack.peek() != ',') {
            postfixStack.push(String.valueOf( opStack.pop()));//将操作符栈中的剩余的元素添加到后缀式栈中
        }
    }
    //判断是否为算术符号
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '(' ||c == ')';
    }
    //利用ASCII码-40做下标去算术符号优先级
    public  boolean compare(char cur,char peek) {// 如果是peek优先级高于cur，返回true，默认都是peek优先级要低
        boolean result  = false;
        if(operatPriority[(peek)-40] >= operatPriority[(cur) - 40]) {
            result = true;
        }
        return result;
    }
    //按照给定的算术运算符做计算
    private String calculate(String firstValue,String secondValue,char currentOp) {
        String result  = "";
        switch(currentOp) {
            case '+':
                result = String.valueOf(ArithHelper.add(firstValue, secondValue));
                break;
            case '-':
                result = String.valueOf(ArithHelper.sub(firstValue, secondValue));
                break;
            case '*':
                result = String.valueOf(ArithHelper.mul(firstValue, secondValue));
                break;
            case '/':
                result = String.valueOf(ArithHelper.div(firstValue, secondValue));
                break;
        }
        return result;
    }
}