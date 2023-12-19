package com.teltheCall.bones.service.impl;

import com.teltheCall.bones.model.TestTable;
import com.teltheCall.bones.model.TestTableRepository;
import com.teltheCall.bones.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaTestTableService implements TestTableService {

  private final TestTableRepository testTableRepository;

  @Autowired
  public JpaTestTableService(TestTableRepository testTableRepository) {
    this.testTableRepository = testTableRepository;
  }

  @Override
  public TestTable findById(long id) {
    return testTableRepository.findById(id);
  }
}
