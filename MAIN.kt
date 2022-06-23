package com.zetcode

import jdk.internal.util.xml.impl.Input
import java.awt.EventQueue
import java.awt.Rectangle
import java.sql.Struct
import javax.swing.*
import java.util.*

fun main (){
    val myframe = JFrame("DATA MAHASISWA")
    myframe.setSize(500,500)
    myframe.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    myframe.layout=null
    val run:Runnable =  Runnable{
        System.out.println("Muhammad Adhiem Wicaksana ")}
    System.out.println("UNFINISHED.CO")
    val t=Thread (run)
    t.start()
    val label = JLabel("PBO")
    val button= JButton("Submit").apply{
        actionCommand = "Submit"
        addActionListener(ButtonClickListener())
    }
    val Input_Nama = JTextField("Maasukan Nama")
    val Input_Nim = JTextField("masukan NIM")
    val Input_alamat = JTextField("Masukan Alamat")
    val getfield = Input_Nama.getText()
    Input_Nim.bounds  =Rectangle(155,220,200,20)
    Input_alamat.bounds  =Rectangle(155,240,200,20)
    Input_Nama.bounds  =Rectangle(155,260,200,20)
    button.bounds= Rectangle(155,300,200,50)
    label.bounds= Rectangle(240,40,200,100)
    myframe.add(button)
    myframe.add(Input_Nama)
    myframe.add(label)
    myframe.add(Input_Nim)
    myframe.add(Input_alamat)
    myframe.isVisible=true


}
