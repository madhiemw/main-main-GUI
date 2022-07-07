
import java.awt.Label
import java.awt.Rectangle
import java.awt.event.FocusListener
import javax.swing.*
import javax.swing.table.DefaultTableModel
import javax.swing.text.JTextComponent


fun main() {
    // constructor frame 1
        val myframe = JFrame("LOGIN PAGE")
    myframe.setSize(500, 500)
    myframe.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    myframe.layout = null
    val Input_Nama = JTextField()
    val Input_Nim = JTextField()
    val Input_jurusan = JTextField("A11.2019.11897")
    val label = JLabel("PBO")
    val button = JButton("Submit")
    val isisubmit = Input_Nama.getText() //triger dari if else password dan username
    // constructor frame 2
    val newframe = JFrame("kandedes")
    newframe.setSize(500, 500)
    newframe.layout = null
    val print_nama = JLabel(Input_Nama.getText())
    val header_newframe1 = JLabel("UDINUS")
    val tableModel = DefaultTableModel()
    val table = JTable(tableModel)
    tableModel.addColumn("NIM")
    tableModel.addColumn("NAMA")
    tableModel.addColumn("jurusan")
    tableModel.insertRow(0, arrayOf<Any>("MUHAMMAD ADHIEM WICAKSANAN", "A11.2019.11897", "Teknik Informatika"))
    tableModel.insertRow(1, arrayOf<Any>(Input_Nama.getText()))
    // bounds posisi setiap variable frame 1
    Input_Nim.bounds = Rectangle(155, 220, 200, 20)
    Input_jurusan.bounds = Rectangle(155, 240, 200, 20)
    Input_Nama.bounds = Rectangle(155, 260, 200, 20)
    button.bounds = Rectangle(155, 300, 200, 50)
    label.bounds = Rectangle(240, 40, 200, 100)
    //bounds posisi setiap variable frame 2
    table.bounds = Rectangle(0, 100, 500, 500)
    header_newframe1.bounds = Rectangle(200, 20, 200, 100)
    print_nama.bounds = Rectangle(240, 40, 200, 100)
    if (isisubmit.equals("A11.2019.11897")) {
            button.addActionListener {
            newframe.add(header_newframe1)
            newframe.add(print_nama)
            newframe.add(table)
            newframe.isVisible = true
        }
}
    //add frame 1
    myframe.add(button)
    myframe.add(Input_Nama)
    myframe.add(label)
    myframe.add(Input_Nim)
    myframe.add(Input_jurusan)
    myframe.isVisible=true
}



