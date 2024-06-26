/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dia_b22_902.titp_lab_1;
import Library_package.*;
import book_package.AbstractBook;
import people_package.Student;
import people_package.Teacher;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

/**
 *
 * @author vanya
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        // Создание объекта библиотеки
        Library library = new Library();

        // Создание корневой папки
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");

        // Создание папки "Учителя"
        DefaultMutableTreeNode teachersNode = new DefaultMutableTreeNode("Учителя");
        // Добавление папки "Учителя" в корневую папку
        rootNode.add(teachersNode);

        // Создание папки "Студенты"
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Студенты");
        // Добавление папки "Студенты" в корневую папку
        rootNode.add(studentsNode);

        // Получение списка билетов из библиотеки
        ArrayList<Ticket> tickets = library.getTickets();

        // Добавление билетов в соответствующие папки
        for (Ticket ticket : tickets) {
            DefaultMutableTreeNode ticketNode = new DefaultMutableTreeNode(ticket.getPeople().getFullName());

            // Получение списка книг из билета
            ArrayList<AbstractBook> books = ticket.getBooks();

            // Добавление книг к билету
            for (AbstractBook book : books) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(book.getName());
                ticketNode.add(bookNode);
            }

            // Определение, должен ли билет быть добавлен в папку "Учителя" или "Студенты"
            if (ticket.getPeople() instanceof Teacher) {
                teachersNode.add(ticketNode);
            } else if (ticket.getPeople() instanceof Student) {
                studentsNode.add(ticketNode);
            }
        }

        // Создание JTree на основе корневой папки
        JTree tree = new JTree(rootNode);

        // Создание панели прокрутки для JTree
        JScrollPane scrollPane = new JScrollPane(tree);

        // Создание фрейма
        JFrame frame = new JFrame("Library Tree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(300, 400);
        frame.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainWindow");
        setMinimumSize(new java.awt.Dimension(100, 100));
        setSize(new java.awt.Dimension(400, 300));

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}


