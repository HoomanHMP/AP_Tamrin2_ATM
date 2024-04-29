import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame{
    public static void main(String[] args){

        //frame
        JFrame f = new JFrame("ATM");
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(new Dimension(734,516)); // 720 * 480
        f.setLayout(null);
        f.getContentPane().setBackground(Color.WHITE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        //Panel l : Language
        JPanel l = new JPanel(null);
        l.setBackground(Color.GRAY);
        l.setBounds(0,0,720,480);
        l.setVisible(true);
        f.add(l);

        //Panel fp  : FPassword
        JPanel fp = new JPanel(null);
        fp.setBackground(Color.GRAY);
        fp.setBounds(0,0,720,480);
        fp.setVisible(false);
        f.add(fp);

        //panel fm  : FMain
        JPanel fm = new JPanel(null);
        fm.setBackground(Color.GRAY);
        fm.setBounds(0,0,720,480);
        fm.setVisible(false);
        f.add(fm);

        //panel fw  : FWithdrawal
        JPanel fw = new JPanel(null);
        fw.setBackground(Color.GRAY);
        fw.setBounds(0,0,720,480);
        fw.setVisible(false);
        f.add(fw);

        //panel fpc : FPasswordChange
        JPanel fpc = new JPanel(null);
        fpc.setBackground(Color.GRAY);
        fpc.setBounds(0,0,720,480);
        fpc.setVisible(false);
        f.add(fpc);

        //panel fmt : FMoneyTransfer
        JPanel fmt = new JPanel(null);
        fmt.setBackground(Color.GRAY);
        fmt.setBounds(0,0,720,480);
        fmt.setVisible(false);
        f.add(fmt);

        //panel fb  : FBalance
        JPanel fb = new JPanel(null);
        fb.setBackground(Color.GRAY);
        fb.setBounds(0,0,720,480);
        fb.setVisible(false);
        f.add(fb);

        //panel fsd : FSuccessfullyDone
        JPanel fsd = new JPanel(null);
        fsd.setBackground(Color.GRAY);
        fsd.setBounds(0,0,720,480);
        fsd.setVisible(false);
        f.add(fsd);

        //Panel ep  : EPassword
        JPanel ep = new JPanel(null);
        ep.setBackground(Color.GRAY);
        ep.setBounds(0,0,720,480);
        ep.setVisible(false);
        f.add(ep);

        //panel em  : EMain
        JPanel em = new JPanel(null);
        em.setBackground(Color.GRAY);
        em.setBounds(0,0,720,480);
        em.setVisible(false);
        f.add(em);

        //panel ew  : EWithdrawal
        JPanel ew = new JPanel(null);
        ew.setBackground(Color.GRAY);
        ew.setBounds(0,0,720,480);
        ew.setVisible(false);
        f.add(ew);

        //panel epc : EPasswordChange
        JPanel epc = new JPanel(null);
        epc.setBackground(Color.GRAY);
        epc.setBounds(0,0,720,480);
        epc.setVisible(false);
        f.add(epc);

        //panel emt : EMoneyTransfer
        JPanel emt = new JPanel(null);
        emt.setBackground(Color.GRAY);
        emt.setBounds(0,0,720,480);
        emt.setVisible(false);
        f.add(emt);

        //panel eb  : EBalance
        JPanel eb = new JPanel(null);
        eb.setBackground(Color.GRAY);
        eb.setBounds(0,0,720,480);
        eb.setVisible(false);
        f.add(eb);

        //panel esd : ESuccessfullyDone
        JPanel esd = new JPanel(null);
        esd.setBackground(Color.GRAY);
        esd.setBounds(0,0,720,480);
        esd.setVisible(false);
        f.add(esd);

//----------------------------------------------------------------------------------------------------------------------

        //Language panel
        JButton lb1 = new JButton("English");
        lb1.setBackground(Color.WHITE);
        lb1.setBounds(20,220,155,40);
        lb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setVisible(false);
                ep.setVisible(true);
            }
        });
        l.add(lb1);

        JButton lb2 = new JButton("فارسی");
        lb2.setBackground(Color.WHITE);
        lb2.setBounds(545,220,155,40);
        lb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setVisible(false);
                fp.setVisible(true);
            }
        });
        l.add(lb2);

        JLabel ll1 = new JLabel("Choose Language");
        ll1.setHorizontalAlignment(SwingConstants.RIGHT);
        ll1.setOpaque(false);
        ll1.setBounds(195,220,155,40);
        l.add(ll1);

        JLabel ll2 = new JLabel("زبان خود را انتخاب کنید");
        ll2.setHorizontalAlignment(SwingConstants.LEFT);
        ll2.setOpaque(false);
        ll2.setBounds(370,220,155,40);
        l.add(ll2);

//----------------------------------------------------------------------------------------------------------------------

        //FPassword panel
        JLabel fpl1 = new JLabel("رمز خود را وارد کنید");
        fpl1.setHorizontalAlignment(SwingConstants.CENTER);
        fpl1.setOpaque(false);
        fpl1.setBounds(280,120,160,40);
        fp.add(fpl1);

        JTextField fpt1 = new JTextField();
        fpt1.setBackground(Color.WHITE);
        fpt1.setBounds(280,220,160,40);
        fp.add(fpt1);

        JButton fpb1 = new JButton("ثبت");
        fpb1.setBackground(Color.WHITE);
        fpb1.setBounds(290,380,140,40);
        fpb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fpt1.setText("");
                fp.setVisible(false);
                fm.setVisible(true);
            }
        });
        fp.add(fpb1);



        //FMain panel
        JButton fmb1 = new JButton("برداشت وجه");
        fmb1.setBackground(Color.WHITE);
        fmb1.setBounds(20,120,155,40);
        fmb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.setVisible(false);
                fw.setVisible(true);
            }
        });
        fm.add(fmb1);

        JButton fmb2 = new JButton("تغییر رمز");
        fmb2.setBackground(Color.WHITE);
        fmb2.setBounds(545,170,155,40);
        fmb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.setVisible(false);
                fpc.setVisible(true);
            }
        });
        fm.add(fmb2);

        JButton fmb3 = new JButton("کارت به کارت");
        fmb3.setBackground(Color.WHITE);
        fmb3.setBounds(20,220,155,40);
        fmb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.setVisible(false);
                fmt.setVisible(true);
            }
        });
        fm.add(fmb3);

        JButton fmb4 = new JButton("اعلام موجودی");
        fmb4.setBackground(Color.WHITE);
        fmb4.setBounds(545,270,155,40);
        fmb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.setVisible(false);
                fb.setVisible(true);
            }
        });
        fm.add(fmb4);

        JButton fmb5 = new JButton("برگشت");
        fmb5.setBackground(Color.WHITE);
        fmb5.setBounds(20,320,155,40);
        fmb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.setVisible(false);
                l.setVisible(true);
            }
        });
        fm.add(fmb5);



        //FWithdrawal panel
        JButton fwb1 = new JButton("۵۰۰۰۰۰");
        fwb1.setBackground(Color.WHITE);
        fwb1.setBounds(20,120,155,40);
        fwb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fw.setVisible(false);
                fsd.setVisible(true);
            }
        });
        fw.add(fwb1);

        JButton fwb2 = new JButton("۱۰۰۰۰۰۰");
        fwb2.setBackground(Color.WHITE);
        fwb2.setBounds(545,170,155,40);
        fwb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fw.setVisible(false);
                fsd.setVisible(true);
            }
        });
        fw.add(fwb2);

        JButton fwb3 = new JButton("۱۵۰۰۰۰۰");
        fwb3.setBackground(Color.WHITE);
        fwb3.setBounds(20,220,155,40);
        fwb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fw.setVisible(false);
                fsd.setVisible(true);
            }
        });
        fw.add(fwb3);

        JButton fwb4 = new JButton("۲۰۰۰۰۰۰");
        fwb4.setBackground(Color.WHITE);
        fwb4.setBounds(545,270,155,40);
        fwb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fw.setVisible(false);
                fsd.setVisible(true);
            }
        });
        fw.add(fwb4);

        JButton fwb5 = new JButton("برگشت");
        fwb5.setBackground(Color.WHITE);
        fwb5.setBounds(20,320,155,40);
        fwb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fw.setVisible(false);
                fm.setVisible(true);
            }
        });
        fw.add(fwb5);



        //FPasswordChange panel
        JLabel fpcl1 = new JLabel("رمز جدید خود را وارد کنید");
        fpcl1.setHorizontalAlignment(SwingConstants.CENTER);
        fpcl1.setOpaque(false);
        fpcl1.setBounds(280,120,160,40);
        fpc.add(fpcl1);

        JTextField fpct1 = new JTextField();
        fpct1.setBackground(Color.WHITE);
        fpct1.setBounds(280,220,160,40);
        fpc.add(fpct1);

        JButton fpcb1 = new JButton("تایید");
        fpcb1.setBackground(Color.WHITE);
        fpcb1.setBounds(380,380,140,40);
        fpcb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fpct1.setText("");
                fpc.setVisible(false);
                fsd.setVisible(true);
            }
        });
        fpc.add(fpcb1);

        JButton fpcb2 = new JButton("برگشت");
        fpcb2.setBackground(Color.WHITE);
        fpcb2.setBounds(200,380,140,40);
        fpcb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fpct1.setText("");
                fpc.setVisible(false);
                fm.setVisible(true);
            }
        });
        fpc.add(fpcb2);



        //FMoneyTransfer panel
        JLabel fmtl1 = new JLabel("مبلغ مورد نظر را وارد کنید");
        fmtl1.setHorizontalAlignment(SwingConstants.CENTER);
        fmtl1.setOpaque(false);
        fmtl1.setBounds(280,60,160,40);
        fmt.add(fmtl1);

        JLabel fmtl2 = new JLabel("شماره کارت مقصد را وارد کنید");
        fmtl2.setHorizontalAlignment(SwingConstants.CENTER);
        fmtl2.setOpaque(false);
        fmtl2.setBounds(280,170,160,40);
        fmt.add(fmtl2);

        JTextField fmtt1 = new JTextField();
        fmtt1.setBackground(Color.WHITE);
        fmtt1.setBounds(280,110,160,40);
        fmt.add(fmtt1);

        JTextField fmtt2 = new JTextField();
        fmtt2.setBackground(Color.WHITE);
        fmtt2.setBounds(280,220,160,40);
        fmt.add(fmtt2);

        JButton fmtb1 = new JButton("ثبت");
        fmtb1.setBackground(Color.WHITE);
        fmtb1.setBounds(380,380,140,40);
        fmtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmtt1.setText("");
                fmtt2.setText("");
                fmt.setVisible(false);
                fsd.setVisible(true);
            }
        });
        fmt.add(fmtb1);

        JButton fmtb2 = new JButton("برگشت");
        fmtb2.setBackground(Color.WHITE);
        fmtb2.setBounds(200,380,140,40);
        fmtb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmtt1.setText("");
                fmtt2.setText("");
                fmt.setVisible(false);
                fm.setVisible(true);
            }
        });
        fmt.add(fmtb2);




        //FBalance
        JLabel fbl1 = new JLabel("موجودی حساب شما: ۱۲۳۴۵۶۷ ریال است");
        fbl1.setHorizontalAlignment(SwingConstants.CENTER);
        fbl1.setOpaque(false);
        fbl1.setBounds(260,60,200,60);
        fb.add(fbl1);

        JButton fbb1 = new JButton("برگشت");
        fbb1.setBackground(Color.WHITE);
        fbb1.setBounds(290,380,140,40);
        fbb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fb.setVisible(false);
                fm.setVisible(true);
            }
        });
        fb.add(fbb1);



        //FSuccessfullyDone
        JLabel fsdl1 = new JLabel("عملیات با موفقیت انجام شد!");
        fsdl1.setHorizontalAlignment(SwingConstants.CENTER);
        fsdl1.setOpaque(false);
        fsdl1.setBounds(260,60,200,60);
        fsd.add(fsdl1);

        JButton fsdb1 = new JButton("برگشت");
        fsdb1.setBackground(Color.WHITE);
        fsdb1.setBounds(290,380,140,40);
        fsdb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fsd.setVisible(false);
                fm.setVisible(true);
            }
        });
        fsd.add(fsdb1);

//----------------------------------------------------------------------------------------------------------------------

        //EPassword panel
        JLabel epl1 = new JLabel("Enter your PIN");
        epl1.setHorizontalAlignment(SwingConstants.CENTER);
        epl1.setOpaque(false);
        epl1.setBounds(280,120,160,40);
        ep.add(epl1);

        JTextField ept1 = new JTextField();
        ept1.setBackground(Color.WHITE);
        ept1.setBounds(280,220,160,40);
        ep.add(ept1);

        JButton epb1 = new JButton("Enter");
        epb1.setBackground(Color.WHITE);
        epb1.setBounds(290,380,140,40);
        epb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ept1.setText("");
                ep.setVisible(false);
                em.setVisible(true);
            }
        });
        ep.add(epb1);



        //EMain panel
        JButton emb1 = new JButton("Withdraw cash");
        emb1.setBackground(Color.WHITE);
        emb1.setBounds(20,120,155,40);
        emb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                em.setVisible(false);
                ew.setVisible(true);
            }
        });
        em.add(emb1);

        JButton emb2 = new JButton("Change password");
        emb2.setBackground(Color.WHITE);
        emb2.setBounds(545,170,155,40);
        emb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                em.setVisible(false);
                epc.setVisible(true);
            }
        });
        em.add(emb2);

        JButton emb3 = new JButton("Transfer funds");
        emb3.setBackground(Color.WHITE);
        emb3.setBounds(20,220,155,40);
        emb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                em.setVisible(false);
                emt.setVisible(true);
            }
        });
        em.add(emb3);

        JButton emb4 = new JButton("Balance");
        emb4.setBackground(Color.WHITE);
        emb4.setBounds(545,270,155,40);
        emb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                em.setVisible(false);
                eb.setVisible(true);
            }
        });
        em.add(emb4);

        JButton emb5 = new JButton("Cancel");
        emb5.setBackground(Color.WHITE);
        emb5.setBounds(20,320,155,40);
        emb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                em.setVisible(false);
                l.setVisible(true);
            }
        });
        em.add(emb5);



        //EWithdrawal panel
        JButton ewb1 = new JButton("500000");
        ewb1.setBackground(Color.WHITE);
        ewb1.setBounds(20,120,155,40);
        ewb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ew.setVisible(false);
                esd.setVisible(true);
            }
        });
        ew.add(ewb1);

        JButton ewb2 = new JButton("1000000");
        ewb2.setBackground(Color.WHITE);
        ewb2.setBounds(545,170,155,40);
        ewb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ew.setVisible(false);
                esd.setVisible(true);
            }
        });
        ew.add(ewb2);

        JButton ewb3 = new JButton("1500000");
        ewb3.setBackground(Color.WHITE);
        ewb3.setBounds(20,220,155,40);
        ewb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ew.setVisible(false);
                esd.setVisible(true);
            }
        });
        ew.add(ewb3);

        JButton ewb4 = new JButton("2000000");
        ewb4.setBackground(Color.WHITE);
        ewb4.setBounds(545,270,155,40);
        ewb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ew.setVisible(false);
                esd.setVisible(true);
            }
        });
        ew.add(ewb4);

        JButton ewb5 = new JButton("Cancel");
        ewb5.setBackground(Color.WHITE);
        ewb5.setBounds(20,320,155,40);
        ewb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ew.setVisible(false);
                em.setVisible(true);
            }
        });
        ew.add(ewb5);



        //EPasswordChange panel
        JLabel epcl1 = new JLabel("Enter the new password");
        epcl1.setHorizontalAlignment(SwingConstants.CENTER);
        epcl1.setOpaque(false);
        epcl1.setBounds(280,120,160,40);
        epc.add(epcl1);

        JTextField epct1 = new JTextField();
        epct1.setBackground(Color.WHITE);
        epct1.setBounds(280,220,160,40);
        epc.add(epct1);

        JButton epcb1 = new JButton("Confirm");
        epcb1.setBackground(Color.WHITE);
        epcb1.setBounds(380,380,140,40);
        epcb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                epct1.setText("");
                epc.setVisible(false);
                esd.setVisible(true);
            }
        });
        epc.add(epcb1);

        JButton epcb2 = new JButton("Cancel");
        epcb2.setBackground(Color.WHITE);
        epcb2.setBounds(200,380,140,40);
        epcb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                epct1.setText("");
                epc.setVisible(false);
                em.setVisible(true);
            }
        });
        epc.add(epcb2);



        //EMoneyTransfer panel
        JLabel emtl1 = new JLabel("Enter the amount you want transferred");
        emtl1.setHorizontalAlignment(SwingConstants.CENTER);
        emtl1.setOpaque(false);
        emtl1.setBounds(240,60,240,40);
        emt.add(emtl1);

        JLabel emtl2 = new JLabel("Enter the destination account number");
        emtl2.setHorizontalAlignment(SwingConstants.CENTER);
        emtl2.setOpaque(false);
        emtl2.setBounds(240,170,240,40);
        emt.add(emtl2);

        JTextField emtt1 = new JTextField();
        emtt1.setBackground(Color.WHITE);
        emtt1.setBounds(280,110,160,40);
        emt.add(emtt1);

        JTextField emtt2 = new JTextField();
        emtt2.setBackground(Color.WHITE);
        emtt2.setBounds(280,220,160,40);
        emt.add(emtt2);

        JButton emtb1 = new JButton("Confirm");
        emtb1.setBackground(Color.WHITE);
        emtb1.setBounds(380,380,140,40);
        emtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emtt1.setText("");
                emtt2.setText("");
                emt.setVisible(false);
                esd.setVisible(true);
            }
        });
        emt.add(emtb1);

        JButton emtb2 = new JButton("Cancel");
        emtb2.setBackground(Color.WHITE);
        emtb2.setBounds(200,380,140,40);
        emtb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emtt1.setText("");
                emtt2.setText("");
                emt.setVisible(false);
                em.setVisible(true);
            }
        });
        emt.add(emtb2);



        //EBalance
        JLabel ebl1 = new JLabel("Your balance is: 1234567 Rial");
        ebl1.setHorizontalAlignment(SwingConstants.CENTER);
        ebl1.setOpaque(false);
        ebl1.setBounds(260,60,200,60);
        eb.add(ebl1);

        JButton ebb1 = new JButton("Cancel");
        ebb1.setBackground(Color.WHITE);
        ebb1.setBounds(290,380,140,40);
        ebb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eb.setVisible(false);
                em.setVisible(true);
            }
        });
        eb.add(ebb1);



        //ESuccessfullyDone
        JLabel esdl1 = new JLabel("Successfully Done!");
        esdl1.setHorizontalAlignment(SwingConstants.CENTER);
        esdl1.setOpaque(false);
        esdl1.setBounds(260,60,200,60);
        esd.add(esdl1);

        JButton esdb1 = new JButton("Main menu");
        esdb1.setBackground(Color.WHITE);
        esdb1.setBounds(290,380,140,40);
        esdb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esd.setVisible(false);
                em.setVisible(true);
            }
        });
        esd.add(esdb1);

//----------------------------------------------------------------------------------------------------------------------

        l.repaint();
        l.revalidate();

        fp.repaint();
        fp.revalidate();
        fm.repaint();
        fm.revalidate();
        fpc.repaint();
        fpc.revalidate();
        fb.repaint();
        fp.revalidate();
        fw.repaint();
        fw.revalidate();
        fmt.repaint();
        fmt.revalidate();
        fsd.repaint();
        fsd.revalidate();

        ep.repaint();
        ep.revalidate();
        em.repaint();
        em.revalidate();
        epc.repaint();
        epc.revalidate();
        eb.repaint();
        ep.revalidate();
        ew.repaint();
        ew.revalidate();
        emt.repaint();
        emt.revalidate();
        esd.repaint();
        esd.revalidate();

    }
}