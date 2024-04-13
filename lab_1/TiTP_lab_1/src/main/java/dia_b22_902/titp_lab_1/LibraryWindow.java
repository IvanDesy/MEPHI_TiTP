package dia_b22_902.titp_lab_1;

import Library_package.*;
import book_package.AbstractBook;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

public class LibraryWindow extends javax.swing.JFrame {

    /**
     * Creates new form LibraryWindow
     */
    public LibraryWindow() {
        initComponents();
        fillJTree();
        
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

    private void initComponents(){
        jScrollPane1 = new javax.swing.JScrollPane();

        DefaultMutableTreeNode rootNode = fillJTree();
        tree = new JTree(rootNode); // Создание JTree на основе корневой папки

        // Создание панели прокрутки для JTree
        JScrollPane scrollPane = new JScrollPane(tree);
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LibraryWindow");
        setMinimumSize(new java.awt.Dimension(100, 100));
        setSize(new java.awt.Dimension(400, 300));

        jScrollPane1.setViewportView(tree);

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
    }
    
    private DefaultMutableTreeNode fillJTree() {
        // Создание объекта библиотеки
        Library library = new Library();

        // Создание корневой папки
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Библиотека");

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
            if ("Teacher".equals(ticket.getPeople().getRole())) {
                teachersNode.add(ticketNode);
            } else if ("Student".equals(ticket.getPeople().getRole())) {
                studentsNode.add(ticketNode);
            }
        }
        return rootNode;
    }
}
