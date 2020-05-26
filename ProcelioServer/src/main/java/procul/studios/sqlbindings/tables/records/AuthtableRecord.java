/*
 * This file is generated by jOOQ.
*/
package procul.studios.sqlbindings.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import procul.studios.sqlbindings.tables.Authtable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthtableRecord extends UpdatableRecordImpl<AuthtableRecord> implements Record5<Integer, String, Integer, String, Long> {

    private static final long serialVersionUID = 672526631;

    /**
     * Setter for <code>authtable.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>authtable.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>authtable.TOKEN</code>.
     */
    public void setToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>authtable.TOKEN</code>.
     */
    public String getToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>authtable.USERID</code>.
     */
    public void setUserid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>authtable.USERID</code>.
     */
    public Integer getUserid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>authtable.CLIENTIP</code>.
     */
    public void setClientip(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>authtable.CLIENTIP</code>.
     */
    public String getClientip() {
        return (String) get(3);
    }

    /**
     * Setter for <code>authtable.EXPIRES</code>.
     */
    public void setExpires(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>authtable.EXPIRES</code>.
     */
    public Long getExpires() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Authtable.AUTHTABLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Authtable.AUTHTABLE.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Authtable.AUTHTABLE.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Authtable.AUTHTABLE.CLIENTIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Authtable.AUTHTABLE.EXPIRES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getClientip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getExpires();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClientip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getExpires();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthtableRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthtableRecord value2(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthtableRecord value3(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthtableRecord value4(String value) {
        setClientip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthtableRecord value5(Long value) {
        setExpires(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthtableRecord values(Integer value1, String value2, Integer value3, String value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthtableRecord
     */
    public AuthtableRecord() {
        super(Authtable.AUTHTABLE);
    }

    /**
     * Create a detached, initialised AuthtableRecord
     */
    public AuthtableRecord(Integer id, String token, Integer userid, String clientip, Long expires) {
        super(Authtable.AUTHTABLE);

        set(0, id);
        set(1, token);
        set(2, userid);
        set(3, clientip);
        set(4, expires);
    }
}
