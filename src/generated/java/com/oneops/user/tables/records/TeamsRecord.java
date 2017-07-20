/*
 * This file is generated by jOOQ.
*/
package com.oneops.user.tables.records;


import com.oneops.user.tables.Teams;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamsRecord extends UpdatableRecordImpl<TeamsRecord> implements Record14<Integer, String, Integer, Timestamp, Timestamp, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = 421514511;

    /**
     * Setter for <code>public.teams.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.teams.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.teams.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.teams.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.teams.organization_id</code>.
     */
    public void setOrganizationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.teams.organization_id</code>.
     */
    public Integer getOrganizationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.teams.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.teams.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.teams.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.teams.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.teams.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.teams.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.teams.design</code>.
     */
    public void setDesign(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.teams.design</code>.
     */
    public Boolean getDesign() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.teams.transition</code>.
     */
    public void setTransition(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.teams.transition</code>.
     */
    public Boolean getTransition() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.teams.operations</code>.
     */
    public void setOperations(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.teams.operations</code>.
     */
    public Boolean getOperations() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.teams.org_scope</code>.
     */
    public void setOrgScope(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.teams.org_scope</code>.
     */
    public Boolean getOrgScope() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.teams.manages_access</code>.
     */
    public void setManagesAccess(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.teams.manages_access</code>.
     */
    public Boolean getManagesAccess() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.teams.cloud_services</code>.
     */
    public void setCloudServices(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.teams.cloud_services</code>.
     */
    public Boolean getCloudServices() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.teams.cloud_compliance</code>.
     */
    public void setCloudCompliance(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.teams.cloud_compliance</code>.
     */
    public Boolean getCloudCompliance() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.teams.cloud_support</code>.
     */
    public void setCloudSupport(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.teams.cloud_support</code>.
     */
    public Boolean getCloudSupport() {
        return (Boolean) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, Integer, Timestamp, Timestamp, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, Integer, Timestamp, Timestamp, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Teams.TEAMS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Teams.TEAMS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Teams.TEAMS.ORGANIZATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Teams.TEAMS.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Teams.TEAMS.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Teams.TEAMS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Teams.TEAMS.DESIGN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Teams.TEAMS.TRANSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Teams.TEAMS.OPERATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Teams.TEAMS.ORG_SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Teams.TEAMS.MANAGES_ACCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Teams.TEAMS.CLOUD_SERVICES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Teams.TEAMS.CLOUD_COMPLIANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Teams.TEAMS.CLOUD_SUPPORT;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOrganizationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDesign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getTransition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getOperations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getOrgScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getManagesAccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getCloudServices();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getCloudCompliance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getCloudSupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value3(Integer value) {
        setOrganizationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value7(Boolean value) {
        setDesign(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value8(Boolean value) {
        setTransition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value9(Boolean value) {
        setOperations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value10(Boolean value) {
        setOrgScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value11(Boolean value) {
        setManagesAccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value12(Boolean value) {
        setCloudServices(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value13(Boolean value) {
        setCloudCompliance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord value14(Boolean value) {
        setCloudSupport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamsRecord values(Integer value1, String value2, Integer value3, Timestamp value4, Timestamp value5, String value6, Boolean value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12, Boolean value13, Boolean value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeamsRecord
     */
    public TeamsRecord() {
        super(Teams.TEAMS);
    }

    /**
     * Create a detached, initialised TeamsRecord
     */
    public TeamsRecord(Integer id, String name, Integer organizationId, Timestamp createdAt, Timestamp updatedAt, String description, Boolean design, Boolean transition, Boolean operations, Boolean orgScope, Boolean managesAccess, Boolean cloudServices, Boolean cloudCompliance, Boolean cloudSupport) {
        super(Teams.TEAMS);

        set(0, id);
        set(1, name);
        set(2, organizationId);
        set(3, createdAt);
        set(4, updatedAt);
        set(5, description);
        set(6, design);
        set(7, transition);
        set(8, operations);
        set(9, orgScope);
        set(10, managesAccess);
        set(11, cloudServices);
        set(12, cloudCompliance);
        set(13, cloudSupport);
    }
}
