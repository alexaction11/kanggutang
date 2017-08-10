package com.kanggutang.model;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.PERMISSION_ID
     *
     * @mbggenerated
     */
    private Integer permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.PERMISSION_NAME
     *
     * @mbggenerated
     */
    private String permissionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.FUNCTION_NAME
     *
     * @mbggenerated
     */
    private String functionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.CREATION_DATE
     *
     * @mbggenerated
     */
    private Date creationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.PERMISSION_ID
     *
     * @return the value of permission.PERMISSION_ID
     *
     * @mbggenerated
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.PERMISSION_ID
     *
     * @param permissionId the value for permission.PERMISSION_ID
     *
     * @mbggenerated
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.PERMISSION_NAME
     *
     * @return the value of permission.PERMISSION_NAME
     *
     * @mbggenerated
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.PERMISSION_NAME
     *
     * @param permissionName the value for permission.PERMISSION_NAME
     *
     * @mbggenerated
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.FUNCTION_NAME
     *
     * @return the value of permission.FUNCTION_NAME
     *
     * @mbggenerated
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.FUNCTION_NAME
     *
     * @param functionName the value for permission.FUNCTION_NAME
     *
     * @mbggenerated
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.CREATION_DATE
     *
     * @return the value of permission.CREATION_DATE
     *
     * @mbggenerated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.CREATION_DATE
     *
     * @param creationDate the value for permission.CREATION_DATE
     *
     * @mbggenerated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionId=").append(permissionId);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", functionName=").append(functionName);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}