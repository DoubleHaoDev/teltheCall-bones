package com.teltheCall.bones.model;



import jakarta.persistence.*;


@Entity
@Table(name = "test_table")
public class TestTable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "test_id", unique = true, nullable = false)
  private Long id;

  @Column(name = "test_column")
  private String type;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
