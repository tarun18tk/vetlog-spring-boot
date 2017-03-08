package com.jos.dem.vetlog.model

import javax.persistence.Id
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.OneToOne
import javax.persistence.JoinColumn
import javax.persistence.FetchType

@Entity
class VetLog {

  @Id
  @GeneratedValue(strategy=AUTO)
  Long id

  @Column(nullable = true)
  String vetName

  @Column(nullable = false)
  String symptoms

  @Column(nullable = false)
  String diagnosis

  @Column(nullable = true)
  String medicine

  @Column(nullable = false)
  Date dateCreated = new Date()

  @OneToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="user_id")
  User user

}
