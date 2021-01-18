package 制作自習;
import java.util.Random;
/**
 * @author 0H02020 難波聖
 *
 */
public class random1 {
	Random random=new Random();
	int count;

	
	public void RM1() {
		 keigokiso a=new keigokiso();
		 gra18 b=new gra18();
		int RM=random.nextInt(2);{
			if(RM==0) {
				a.setVisible(true);
			}else if(RM==1) {
				b.setVisible(true);
			}
		}		
	}
	
	public void RM2() {
		BMS10 a=new BMS10();
		BMS02 b=new BMS02();
		BMS03 c=new BMS03();
		BMS09 d=new BMS09();
		yougo2 e = new yougo2();
		yougo22 f = new yougo22();
		yougo24 g = new yougo24();
		int RM=random.nextInt(7);{
			if(RM==0) {
				a.setVisible(true);
			}else if(RM==1) {
				b.setVisible(true);
			}else if(RM==2) {
				c.setVisible(true);
			}else if(RM==3) {
				d.setVisible(true);
			}else if(RM==4) {
				e.setVisible(true);
			}else if(RM==5) {
				f.setVisible(true);
			}else if(RM==6) {
				g.setVisible(true);
			}
		}
	}
}