package logan.adapter.iterenum;

import static java.util.stream.Collectors.toList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EI {

    public static void main(String[] args) {
        var list = IntStream.range(0, 10).mapToObj(String::valueOf).collect(toList());
        log.info("{}", list);
        Vector<String> v = new Vector<>(list);
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            log.info("{}", enumeration.nextElement());
        }
        Enumeration<String> enumeration2 = new IteratorEnumeration<>(v.iterator());
        while (enumeration2.hasMoreElements()) {
            log.info(enumeration2.nextElement());
        }
        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            log.info(iterator.next());
        }
        Iterator<String> iterator2 = new EnumerationIterator<>(v.elements());
        while (iterator2.hasNext()) {
            log.info(iterator2.next());
        }

    }

}
