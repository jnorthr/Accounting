/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
import spock.lang.Specification
import com.jim.toolkit.database.H2RowSupport;
import java.sql.SQLException;
import com.jim.toolkit.Cell;
import com.jim.toolkit.Cells;

class H2RowSupportTest extends Specification {
    def "Simple H2RowSupport constructor returns proper names for database connection values"() {
        setup:
		    H2RowSupport obj = null;
        when:
            obj = new H2RowSupport();
        then:
        	obj.classname == "H2RowSupport"
    } // end of test


    def "obj.toString() from H2RowSupport()"() {
        setup:
            H2RowSupport obj = new H2RowSupport();

        when:
            def selectmsg = obj.toString();

        then:
            selectmsg.startsWith("classname=H2RowSupport\njava.io.File.separator=") == true
    } // end of test


    def "H2RowSupport().add(Map e)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();
            Map e = [:]

        when:
            def selectmsg = obj.add(e)

        then:
            selectmsg == false

    } // end of test


    def "H2RowSupport().add(Cell c)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();
            Cell c = new Cell();

        when:
            def selectmsg = obj.add(c)

        then:
            selectmsg == true

    } // end of test


    def "H2RowSupport().add(Integer id, Date rowdate, Character ty, BigDecimal amt, Integer ccy, Integer num, Boolean flg, String txt, String name)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();
			Integer id = 44;
			Date rowdate = new Date()
			Character ty = 'C'
			BigDecimal amt = 789.12
			Integer ccy = 1
			Integer num = 123
			Boolean flg = false
			String txt = "Yes sir"
            String name = "Jim"

        when:
            def selectmsg = obj.add(id, rowdate, ty, amt, ccy, num, flg, txt, name)

        then:
            selectmsg == true

    } // end of test


    def "H2RowSupport().add(Date rowdate, Character ch, BigDecimal amt, String txt)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();
			Date rowdate = new Date()
			Character ch = 'B'
			BigDecimal amt = 123.45
			String txt = "Hi guys"

        when:
            def selectmsg = obj.add(rowdate, ch, amt, txt)

        then:
            selectmsg == false

    } // end of test


    def "H2RowSupport().add(Date rowdate, Character ch, BigDecimal amt, String txt)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();
			Date rowdate = new Date()
			Character ch = 'A';
			BigDecimal amt = -123.45
			String txt = "Hi kids"

        when:
            def selectmsg = obj.add(rowdate, ch, amt, txt)

        then:
            selectmsg  == false
    } // end of test


    def "H2RowSupport().remove(int which)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();

        when:
            def ok = obj.remove(1999) // remove non-existent row

        then:
            ok == true
    } // end of test


    def "H2RowSupport().update(int which)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();

        when:
            Map m = ['id':666,name:'Hi kids']
            def ok = obj.update(m)

        then:
            ok == false
    } // end of test


    def "H2RowSupport().int setId(myId)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();

        when:
            def selectmsg = obj.setId(66)

        then:
            selectmsg == 66
    } // end of test


    def "H2RowSupport().Cells getId(myId)"() {
        setup:
            H2RowSupport obj = new H2RowSupport();

        when:
            Cells s = obj.getId(1)

        then:
            s.size() == 1
    } // end of test

} // end of class
