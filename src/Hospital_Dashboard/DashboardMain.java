package Hospital_Dashboard;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class DashboardMain extends JFrame implements ActionListener {
    JPanel navbar;
    JPanel sidebar;
    JPanel mainTab;
    JPanel recordPane;
    JPanel graphPane;
    JLabel logo;
    JLabel noOfPatients; JLabel noOfDoctors;

    private JFreeChart chart;
    private ChartPanel chartPanel;
    public DashboardMain(){
        setTitle("Hospital Dashboard");



//        Creating Padding in java swing
        int padding1 = 10; int padding2 = 10; int padding3 = 10; int padding4 = 10;
        EmptyBorder BorderPadding = new EmptyBorder(padding1, padding1, padding1, padding1);
        EmptyBorder listPadding = new EmptyBorder(padding1, padding2, padding1, padding1 );

//        Creating Border in java swing
        Border border = BorderFactory.createLineBorder(Color.RED, 1);
        Border whiteBorder = BorderFactory.createLineBorder(Color.WHITE, 1);

//        Creating Margin in Java swing
        int topMargin = 0; int leftMargin = 500; int bottomMargin = 0; int rightMargin = 20;
        EmptyBorder marginBorder = new EmptyBorder(topMargin, leftMargin, bottomMargin, rightMargin);

//      Creating bg color in Java swing
        Color backgroundColor = Color.WHITE;
        Color transparentRed = new Color(255, 0, 0, 7);

        navbar = new JPanel();
        navbar.setBackground(backgroundColor);

        logo = new JLabel("HEALTH-WISE");
        logo.setFont(new Font("Arial", Font.BOLD, 15));
        logo.setBorder(BorderPadding);
        navbar.setBorder(border);

//      Creating NavList
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Notifications");
        l1.addElement("Diagnoses");
        l1.addElement("Contact");
        l1.addElement("Appointments");
        JList<String> list = new JList<>(l1);
        list.setFont(new Font("Arial", Font.BOLD, 12));
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(1);
        list.setBorder(marginBorder);
        list.setCellRenderer(new ImageListRenderer2());
//        list.setCellRenderer(new SpacingListCellRenderer(10));

        navbar.add(logo); navbar.add(list);
        navbar.setLayout(new FlowLayout(FlowLayout.LEADING));
        navbar.setBounds(0,0,1000, 70);
        add(navbar);

//        Creating the sidebar
        sidebar = new JPanel();
        sidebar.setBackground(backgroundColor);
//      Creating Sidebar list
        DefaultListModel<String> List2 = new DefaultListModel<>();
        List2.addElement("Overview");
        List2.addElement("Pager");
        List2.addElement("Patients");
        List2.addElement("Appointments");
        JList<String> sideBarList = new JList<>(List2);
        sideBarList.setCellRenderer(new ImageListRenderer());
//        sideBarList.setCellRenderer(new SpacingListCellRenderer(2));
        sideBarList.setBorder(listPadding);

        sidebar.add(sideBarList);
        sidebar.setLayout(new FlowLayout(FlowLayout.CENTER));
        sidebar.setBounds(0,72,150, 930);
        sidebar.setBorder(border);
        add(sidebar);


//      Creating the main bar
        mainTab = new JPanel();
        mainTab.setBounds(152,72,850, 930);
        mainTab.setBorder(border);
        mainTab.setLayout(null);
        mainTab.setBackground(transparentRed);

//      Creating record panel
        recordPane = new JPanel();
        recordPane.setBounds(5,10,850, 40);
        noOfPatients = new JLabel("No of Patients: 850");
        noOfDoctors = new JLabel("No of Doctors: 50");
        noOfDoctors.setBorder(marginBorder);
        recordPane.add(noOfDoctors);
        recordPane.add(noOfPatients);
        recordPane.setBorder(border);
        recordPane.setBackground(Color.white);

//        Creating graph pane
        graphPane = new JPanel();
        graphPane.setBounds(5,55,650, 450);
//        graphPane.setBorder(border);
        graphPane.setBackground(backgroundColor);

//        Creating the graph
        XYSeries series = new XYSeries("Data");
        series.add(0, 1);
        series.add(1, 2);
        series.add(2, 3);
        series.add(3, 3);
        series.add(4, 4);
        series.add(5, 5);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        chart = ChartFactory.createXYLineChart("", "", "", dataset, PlotOrientation.HORIZONTAL, false, true, false);
        chartPanel = new ChartPanel(chart);
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.BLUE);

        chart.getXYPlot().setRenderer(renderer);
//        chartPanel.setBorder(BorderPadding);
        graphPane.add(chartPanel);
        mainTab.add(recordPane); mainTab.add(graphPane);

//        Creating Aside bar
        JPanel asideBar = new JPanel();
        asideBar.setBounds(660,55,200, 870);
        asideBar.setBorder(whiteBorder);
        asideBar.setBackground(transparentRed);
        mainTab.add(asideBar);

//        Creating Aside list
        DefaultListModel<String> l3 = new DefaultListModel<>();
        l3.addElement("Ambulances");
        l3.addElement("Doctors");
        l3.addElement("Nurses");
        l3.addElement("Porters");
        l3.addElement("Lab Technicians");
        l3.addElement("Pharmacy");
        l3.addElement("Finance");
        l3.addElement("Surgery");
        l3.addElement("Vaccines");
        l3.addElement("Laboratory");
        l3.addElement("Deaths");
        l3.addElement("Morgue");

        JList<String> list3 = new JList<>(l3);
        list3.setFont(new Font("Arial", Font.BOLD, 12));
//        list3.setBorder(marginBorder);
        list3.setCellRenderer(new ImageListRenderer2());
        list3.setSize(200, 870);
        list3.setBackground(transparentRed);
        asideBar.add(list3);

        add(mainTab);
        setLayout(null);
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class ImageListRenderer extends DefaultListCellRenderer {
        // Load the image or set a default image
        private ImageIcon icon = new ImageIcon("image/list-linearBig.png");
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            // Set the text and icon for the list item
            label.setText(value.toString());
            label.setIcon(icon);

            return label;
        }
    }

    static class ImageListRenderer2 extends DefaultListCellRenderer {
        // Load the image or set a default image
        private ImageIcon icon = new ImageIcon("image/destiny-item-manager-xsm.png");
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            // Set the text and icon for the list item
            label.setText(value.toString());
            label.setIcon(icon);

            return label;
        }
    }

    /*static class SpacingListCellRenderer extends DefaultListCellRenderer {
        private int spacing;

        public SpacingListCellRenderer(int spacing) {
            this.spacing = spacing;
        }

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            // Adjust the preferred size of the label to include the desired spacing between items
            Dimension preferredSize = label.getPreferredSize();
            preferredSize.height += spacing;
            label.setPreferredSize(preferredSize);

            return label;
        }
    }*/

    public static void main(String[] args) {
        new DashboardMain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
