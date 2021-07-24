import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int T = Integer.parseInt(br.readLine());
            
            StringTokenizer st;
            // StringTokenizer를 선언한 이유는,
            // 요구사항이 입력받을 때 한줄로 받도록 되어있기 때문이다.
            // split처럼 사용할수있다.
            
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                
                bw.write(A+B + "\n");
                // 개행 시켜주는 문자열인 \n을 더해주면,
                // A+B는 자동으로 String으로 바뀐다.
            }
            bw.flush();
            bw.close();
            br.close();
    }
}
			/*BufferedReader/ BufferedWriter
			 * 두 함수는 이름에서도 알 수 있듯이 버퍼를 이용해서 입출력을 하는 메소드이다.
			 * 
			 * 버퍼(Buffer)
			 * 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
			 * 입출력 속도 향상을 위해 버퍼 사용
			 * 
			 * 버퍼 플러시(Buffer flush)
			 * 버퍼에 남아 있는 데이터를 출력시킴 (버퍼를 비우는 동작)\
			 * 
			 * 버퍼를 이용한 입력 - BufferedReader
			 * 버퍼를 이용한 출력 - BufferedWriter
			 * 
			 * <버퍼를 사용하지 않는 입력>
			 * 키보드 -> 프로그램 (키보드의 입력이 키를 누르는 즉시 바로 전달됨)
			 * 
			 * <버퍼를 사용하는 입력>
			 * 키보드 -> 버퍼 -> 프로그램
			 * 키보드 -> 버퍼 (키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송함)
			 * 버퍼 -> 프로그램 (버퍼가 가득 차거나, 개행 문자가 나타나면, 버퍼의 내용을 한 번에 전송함)
			 * 
			 * 입력도 사용자가 키보드에 누를 때마다 전달을 하는 것이 아니라 버퍼에 용량만큼 모았다가 전달해주는 것이다.
			 * 생각해보면 현재 위치에서 10m 떨어진 곳에서 어떤 물건을 옮겨야하는데 하나씩 옮기는 것보단 한번에 최대로 옮겨야 덜 힘들고 빠를 것이다.
			 * 
			 * 출력도 마찬가지로 버퍼를 거쳐서 간접적으로 출력장치로 전달되기에 시스템의 데이터처리 효율성을 높여주며 버퍼스트림을 InputStreamReader/ OutputStreamWriter를 같이 사용하여
			 * 버퍼링을 하게 되면 입출력 스트림으로부터 미리 버퍼에 데이터를 갖다 놓기 때문에 보다 효율적인 입출력이 가능하다.
			 * 
			 * BufferedReader
			 * Scanner를 통해 입력을 받을 경우 Space Enter를 모두 경계로 인식하기에 입력받은 데이터를 가공하기 매우 편리하다.
			 * 하지만 그에 비해 BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로 고정되기 때문에
			 * 입력받은 데이터를 가공하는 작업이 필요할 경우가 많다.
			 * 하지만 많은 양의 데이터를 입력받을 경우 BufferedReader를 통해 입력받는 것이 효율면에서 훨씬 낫다.
			 * 
			 * 공식 문서에서는 입력 스트림에서 문자를 읽는 함수인데 문자나 배열, 라인들을 효율적으로 읽기 위해서 문자들을 버퍼에 저장하고(버퍼링) 읽는 방법을 취한다고 했다.
			 * 버퍼 사이즈는 우리가 지정할 수도 있지만 지정안할 경우에는 기존 디폴트 사이즈가 사용된다고 나와 있다.
			 * 
			 * 첫번째는 BufferedReader의 readLine()을 사용하면 데이터를 라인 단위로 읽을 수 있다. Scanner에서 nextLine()과 같다. 
			 * readLine 함수의 리턴 값은 String으로 고정되기 때문에 String이 아닌 다른 타입으로 입력을 받으려면 형변환을 꼭 해줘야 한다.
			 * 
			 * 두번째는 예외처리를 꼭 해주어야한다는 점이다. 
			 * readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업한다.
			 * 
			 * 그러면 알고리즘 풀다보면 한 줄에 입력을 여러개 받아야 하는 상황이라면?
			 * 그때는 StringTokenizer 클래스 또는 String 클래스의 메소드인 Splite을 이용해서 공백을 기준으로 나누면 된다.
			 * 
			 * readLine()메소드를 이용해서 입력을 받으면 한 줄을 입력으로 받기 때문에 5 4 와 같이 공백을 넣어서 입력을 해도 공백을 포함해서 버퍼에 넣는다. 
			 * 그래서 공백을 기준으로 나누기 위해서는 
			 * 첫번째로 StringTokenizer 클래스를 이용하고 
			 * 두번째로 Splite(" ")메소드를 이용해서 입력받은 문자를 나눈다.
			 * 
			 * BufferedWriter
			 * System.out.print("");와 같이 동일한 기능인 출력을 하는 메소드이다. 
			 * BufferedWriter 함수 또한 버퍼를 이용하기 때문에 성능이 print메소드 보다 좋다. 
			 * 알고리즘 풀 때 처럼 많은 양의 출력이 필요하다면 BufferWriter를 사용하자.
			 * 
			 * 여기서 write() 메소드는 String형으로만 출력이 가능하기 때문에 정수를 출력하려면 String.valueOf() 메소드를 이용해서 String으로 변환을 한 후에 출력을 해야한다. 
			 * BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야한다. 
			 * 그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야 하는점 잊지말자.
			 * 
			 *  주요 Method
			 *  메서드명						기능
			 *  BufferedReader(Reader rd)				rd에 연결되는 문자입력 버퍼스트림 생성
			 *  BufferedWriter(Writer wt)				wt에 연결되는 문자출력 버퍼스트림 생성
			 *  int read()						스트림으로부터 한 문자를 읽어서 int 형으로 리턴
			 *  int read(char[] buf)				문자배열 buf의 크기만큼 문자를 읽어드림. 읽어드린 문자 수를 리턴 
			 *  int read(char[] buf, int offset, int length) 	buf의 offset위치에서부터 length 길이만큼 문자를 스트림으로부터 읽어들임
			 *  String readLine()					스트림으로부터 한 줄을 읽어 문자열로 리턴
			 *  void mark()						현재위치를 마킹, 차후 reset()을 이용하여 마킹워치부터 시작함
			 *  void reset()					마킹이 있으며 그 위치에서부터 다시 시작, 그렇지 않으면 처음부터 다시 시작
			 *  long skip(int n)					n개의 문자를 건너 뜀
			 *  void close()					스트림 닫음
			 *  void write(int c)					int 형으로 문자 데이터를 출력문자스트림으로 출력
			 *  void write(String s, int offset, int length)	문자열 s를 offset 위치부터 length 길이만큼을 출력스트림으로 출력
			 *  void write(char[] buf, int offset, int length)  	문자배열 buf 의 offset 위치부터 length 길이만큼을 출력스트림으로 출력
			 *  void newLine()					줄바꿈 문자열 출력
			 *  void flush()					남아있는 데이터를 모두 출력시
			 *  
			 *  BufferedReader에도 단점이 있다.
			 *  1. IOException의 예외처리가 필수적이다.
			 *  2. 입력받은 모든 데이터가 String으로 반환된다.
			 *  3. 줄마다 입력받아서, 따로 split하여 데이터를 처리해주어야 한다.
			 *  4. 숫자형식으로 받기 위해서는 형변환이 필요하다.
			 *
			 *  이게 어떤 말이냐면, Input Data에 1 2 3이 들어왔다고 하자.
			 *  Scanner의 nextInt()로 받으면, [1, 2, 3]을 차례대로 받을 수 있다. 
			 *  하지만 BufferedReader의 readLine()으로 받으면, "1 2 3"이라는 문자열 자체로 받으며, split(' ')로 띄어쓰기를 구분하여 Integer.parseInt() 과정이 필요해진다는 말이다.
			 *  
			 *  1. import는 java.io.*로 한다. (Scanner는 java.util 클래스이다.)
			 *  2. main함수 우측에 throws IOException을 통해 예외를 처리한다. (메소드 선언부에 throws를 명시하면, 해당 메소드 내에서 exception이 발생하는 경우 해당 메소드를 호출한 곳에서 예외가 발생한다.)
			 *  3. BufferedReader, BufferedWriter를 선언한다.
			 *  4. n을 입력받고, n만큼 loop를 돈다.
			 *  4-1. 해당 줄 전체를 String으로 입력받아, 스페이스로 구분하여 형변환하여 덧셈을 수행한다.
			 *  5. BufferedWriter에 써준다.
			 *  6. Buffer를 비워준다.

			 *  여기서, bw.write()는 버퍼에 쓰는것이지, 화면에 출력되는 것이 아니다. 
			 *  화면에 출력하는 역할은 bw.flush()가 수행한다. 
			 *  bw.flush()는 출력이 필요할 때 한 번만 수행해주면 된다. 
			 *  만약 for문 안에 bw.flush()를 쓰면, 버퍼에 쓰고 바로 출력하므로 System.out.print와 다를바가 없다.
			 *  이전에 쇼핑카트 예제에서, 쇼핑카트에 물건 1개만 담고 계산대로 가져가고, 또 1개만 담고 계산대로 나르고... 하는것과 같은거다! 
			 * */
	            
	


