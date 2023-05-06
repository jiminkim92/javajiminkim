package multiThreading;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dr = new DressRoom();
		Thread 고객1 = new Thread(dr,"홍씨");
		Thread 고객2 = new Thread(dr,"이씨");
		Thread 고객3 = new Thread(dr,"강씨");
		
		// 사람 3명(Thread 3개)
		고객1.start();
		고객2.start();
		고객3.start();		
	}
}

// 의상탈의실
// 의류가게에서는 한 사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다 (10초)
class DressRoom implements Runnable{
	private int time;
	
	@Override
	public void run() {
		synchronized (this) {				// 이미 사용중이면 다른 애들은 대기
			String name = Thread.currentThread().getName();
			time = 0;
			System.out.println(name+" 의상실 들어감");
			for(time = 1; time <= 11;time++) {
			
				System.out.println(name+" 의상실 사용 중..."+time+"초");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(name+" 의상실 나옴");
		}
		
	}
}