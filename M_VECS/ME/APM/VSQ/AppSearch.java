package ME.APM.VSQ;
import java.awt.Container;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import ME.APM.VSQ.OPE.search.ChanJPanel;
import ME.APM.VSQ.OPE.search.ChouchuJPanel;
import ME.APM.VSQ.OPE.search.ChuangJPanel;
import ME.APM.VSQ.OPE.search.DuJPanel;
import ME.APM.VSQ.OPE.search.HanJPanel;
import ME.APM.VSQ.OPE.search.KuangJPanel;
import ME.APM.VSQ.OPE.search.PaixieJPanel;
import ME.APM.VSQ.OPE.search.QitaJPanel;
import ME.APM.VSQ.OPE.search.ReJPanel;
import ME.APM.VSQ.OPE.search.TanJPanel;
import ME.APM.VSQ.OPE.search.TongJPanel;
import ME.APM.VSQ.OPE.search.XueJPanel;
import ME.APM.VSQ.OPE.search.YangJPanel;
import SVQ.stable.StableFile;
public class AppSearch extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	
	public void IV_(JTextField name){
		StableFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container HanContainer= new Container();
		HanJPanel hanJPanel= new HanJPanel(name);
		HanContainer.setLayout(null);
		HanContainer.setBounds(0, 0, 1490, 980);
		HanContainer.add(hanJPanel);
		jTabbedpane.addTab("发冷", new ImageIcon(), HanContainer, "发冷");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
		
		Container reContainer= new Container();
		ReJPanel reJPanel= new ReJPanel(name);
		reContainer.setLayout(null);
		reContainer.setBounds(0, 0, 1490, 980);
		reContainer.add(reJPanel);
		jTabbedpane.addTab("发热", new ImageIcon(), reContainer, "发热");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 
		
		Container TongContainer= new Container();
		TongJPanel tongPanel= new TongJPanel(name);
		TongContainer.setLayout(null);
		TongContainer.setBounds(0, 0, 1490, 980);
		TongContainer.add(tongPanel);
		jTabbedpane.addTab("疼痛", new ImageIcon(), TongContainer, "疼痛");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 
		
		Container chouContainer= new Container();
		ChouchuJPanel chouJPanel= new ChouchuJPanel(name);
		chouContainer.setLayout(null);
		chouContainer.setBounds(0, 0, 1490, 980);
		chouContainer.add(chouJPanel);
		jTabbedpane.addTab("抽筋", new ImageIcon(), chouContainer, "抽筋");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 
		
		Container duContainer= new Container();
		DuJPanel duJPanel= new DuJPanel(name);
		duContainer.setLayout(null);
		duContainer.setBounds(0, 0, 1490, 980);
		duContainer.add(duJPanel);
		jTabbedpane.addTab("中毒", new ImageIcon(), duContainer, "中毒");
		jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4); 
		
		Container chuangContainer= new Container();
		ChuangJPanel chuangJPanel= new ChuangJPanel(name);
		chuangContainer.setLayout(null);
		chuangContainer.setBounds(0, 0, 1490, 980);
		chuangContainer.add(chuangJPanel);
		jTabbedpane.addTab("脓疮", new ImageIcon(), chuangContainer, "脓疮");
		jTabbedpane.setMnemonicAt(5, KeyEvent.VK_5); 
		
		Container kuangContainer= new Container();
		KuangJPanel kuangJPanel= new KuangJPanel(name);
		kuangContainer.setLayout(null);
		kuangContainer.setBounds(0, 0, 1490, 980);
		kuangContainer.add(kuangJPanel);
		jTabbedpane.addTab("癫狂", new ImageIcon(), kuangContainer, "癫狂");
		jTabbedpane.setMnemonicAt(6, KeyEvent.VK_6); 
		
		Container paixieContainer= new Container();
		PaixieJPanel paixieJPanel= new PaixieJPanel(name);
		paixieContainer.setLayout(null);
		paixieContainer.setBounds(0, 0, 1490, 980);
		paixieContainer.add(paixieJPanel);
		jTabbedpane.addTab("排泄", new ImageIcon(), paixieContainer, "排泄");
		jTabbedpane.setMnemonicAt(7, KeyEvent.VK_7); 
		
		Container TanContainer= new Container();
		TanJPanel tanJPanel= new TanJPanel(name);
		TanContainer.setLayout(null);
		TanContainer.setBounds(0, 0, 1490, 980);
		TanContainer.add(tanJPanel);
		jTabbedpane.addTab("痰汗", new ImageIcon(), TanContainer, "痰汗");
		jTabbedpane.setMnemonicAt(8, KeyEvent.VK_8); 
		
		Container xueContainer= new Container();
		XueJPanel xueJPanel= new XueJPanel(name);
		xueContainer.setLayout(null);
		xueContainer.setBounds(0, 0, 1490, 980);
		xueContainer.add(xueJPanel);
		jTabbedpane.addTab("出血", new ImageIcon(), xueContainer, "出血");
		jTabbedpane.setMnemonicAt(9, KeyEvent.VK_9); 
		
		Container yangContainer= new Container();
		YangJPanel yangJPanel= new YangJPanel(name);
		yangContainer.setLayout(null);
		yangContainer.setBounds(0, 0, 1490, 980);
		yangContainer.add(yangJPanel);
		jTabbedpane.addTab("瘙痒", new ImageIcon(), yangContainer, "瘙痒");
		
		Container fuchanContainer= new Container();
		ChanJPanel fuchanJPanel= new ChanJPanel(name);
		fuchanContainer.setLayout(null);
		fuchanContainer.setBounds(0, 0, 1490, 980);
		fuchanContainer.add(fuchanJPanel);
		jTabbedpane.addTab("妇产", new ImageIcon(), fuchanContainer, "妇产");
		
		Container qitaContainer= new Container();
		QitaJPanel qitaJPanel= new QitaJPanel(name);
		qitaContainer.setLayout(null);
		qitaContainer.setBounds(0, 0, 1490, 980);
		qitaContainer.add(qitaJPanel);
		jTabbedpane.addTab("其他", new ImageIcon(), qitaContainer, "其他");
		
		this.setPreferredSize(new Dimension(800, 600));
		this.add(jTabbedpane);
		this.setBounds(0, 0, 805, 605);
		this.setVisible(true);
		this.validate();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}