package design.exam05;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 学号生成器
 * Created by MelloChan on 2017/10/29.
 */
public class IDGenerator {
    private static volatile IDGenerator idGenerator;
    private static AtomicLong id = new AtomicLong();

    private IDGenerator() {
    }

    public static IDGenerator getInstance() {
        if (idGenerator == null) {
            synchronized (IDGenerator.class) {
                if (idGenerator == null) {
                    idGenerator = new IDGenerator();
                }
            }
        }
        return idGenerator;
    }

    /**
     * @param studentInfo
     * @return
     */
    public String createStuId(BaseInfo studentInfo) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(studentInfo.getYear()).append(studentInfo.getCollage()).
                append(studentInfo.getPreCode()).append(studentInfo.getClassCode());
        if(id.get()<=9){
            stringBuffer.append(0).append(id.get());
        }else{
            stringBuffer.append(id.incrementAndGet());
        }
        id.incrementAndGet();
        return stringBuffer.toString();
    }
}
