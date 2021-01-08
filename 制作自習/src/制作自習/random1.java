package 制作自習;
import java.util.Random;
/**
 * @author 0H02020 難波聖
 *
 */
public class random1 {
	Random random=new Random();
	int count=0;

	
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
	
	public void setcount(){
		count+=1;
	}
	
	public int getcount() {
		return (count);
	}
	
	public void recount() {
		count=0;
	}
}
