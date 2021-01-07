package 制作自習;
import java.util.Random;

/**
 * 
 */

/**
 * @author 0H02020 難波聖
 *
 */
public class random1 {
	int sum=0;
	keigokiso a=new keigokiso();
	gra18 b=new gra18();
	public void Rand() {
		Random random=new Random();
		int RM=random.nextInt(2);{
			if(RM==0) {
				a.setVisible(true);
			}else if(RM==1) {
				b.setVisible(true);
			}
		}
	}
	
	public void pcount() {
		sum+=1;
	}
	
	public int getcount() {
		return (sum);
	}
}
