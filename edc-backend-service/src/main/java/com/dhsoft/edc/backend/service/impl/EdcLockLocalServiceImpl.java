package com.dhsoft.edc.backend.service.impl;

import com.dhsoft.edc.backend.model.EdcLock;
import com.dhsoft.edc.backend.service.base.EdcLockLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
  property = "model.class.name=com.dhsoft.edc.backend.model.EdcLock",
  service = AopService.class
)
public class EdcLockLocalServiceImpl extends EdcLockLocalServiceBaseImpl {

  public List<EdcLock> getAll() {
    return edcLockPersistence.findAll();
  }

  public EdcLock addLock(
      long companyId,
      long groupId,
      long projectId,
      long classNameId,
      long classPK,
      String lockType,
      long userId,
      String userName,
      String comment
  ) {
    long lockId = CounterLocalServiceUtil.increment(EdcLock.class.getName());
    Date now = new Date();

    EdcLock lock = edcLockPersistence.create(lockId);
    lock.setCompanyId(companyId);
    lock.setGroupId(groupId);
    lock.setProjectId(projectId);

    lock.setClassNameId(classNameId);
    lock.setClassPK(classPK);
    lock.setLockType(lockType);

    lock.setUserId(userId);
    lock.setUserName(userName);

    lock.setCreateDate(now);
    lock.setModifiedDate(now);

    lock.setComment(comment);

    return edcLockPersistence.update(lock);
  }

  public EdcLock updateLock(
      long lockId,
      String lockType,
      String comment
  ) throws Exception {
    EdcLock lock = edcLockPersistence.findByPrimaryKey(lockId);
    if (lockType != null) lock.setLockType(lockType);
    lock.setComment(comment);
    lock.setModifiedDate(new Date());
    return edcLockPersistence.update(lock);
  }

  public EdcLock deleteLock(long lockId) throws Exception {
    return edcLockPersistence.remove(lockId);
  }
}
