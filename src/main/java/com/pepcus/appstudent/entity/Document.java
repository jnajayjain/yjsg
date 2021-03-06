package com.pepcus.appstudent.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

/**
 * Entity class used to map table in DB
 * 
 * @author Sandeep Vishwakarma
 * @since 05-02-2020
 *
 */
@Entity
@Table(name = "document")
@Data
@JsonInclude(Include.ALWAYS)
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "document_rank")
    private Integer rank;

    @Column(name = "document_url")
    private String url;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date dateCreatedInDB;

    @Column(name = "last_modified_date")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date dateLastModifiedInDB;
    
    @Column(name = "document_uploaded_date")
    @JsonIgnore
    private Date documentUploadedDate;

    @Transient
    @JsonProperty(access = Access.READ_ONLY)
    private String createdDate;

    @Transient
    @JsonProperty(access = Access.READ_ONLY)
    private String lastModifiedDate;
    
    @Transient
    @JsonProperty(access = Access.READ_ONLY)
    private String uploadedDate;

}