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

  // ✅ 기존 addLock (호환 유지)
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
    return addLock(
        companyId,
        groupId,
        projectId,
        classNameId,
        classPK,
        lockType,
        userId,
        userName,
        comment,
        null,
        null
    );
  }

  // ✅ 신규 addLock (startDate/endDate 포함)
  public EdcLock addLock(
      long companyId,
      long groupId,
      long projectId,
      long classNameId,
      long classPK,
      String lockType,
      long userId,
      String userName,
      String comment,
      Date startDate,
      Date endDate
  ) {
    long lockId = CounterLocalServiceUtil.increment(EdcLock.class.getName());
    Date now = new Date();

    // ✅ 기간 유효성(선택 but 추천)
    if (startDate != null && endDate != null && !startDate.before(endDate)) {
      throw new IllegalArgumentException("endDate must be after startDate");
    }

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

    // ✅ 추가된 컬럼 세팅
    lock.setStartDate(startDate);
    lock.setEndDate(endDate);

    return edcLockPersistence.update(lock);
  }

  // ✅ 기존 updateLock (호환 유지)
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

  // ✅ 신규 updateLock (기간까지 변경 가능)
  public EdcLock updateLock(
      long lockId,
      String lockType,
      String comment,
      Date startDate,
      Date endDate
  ) throws Exception {
    // ✅ 기간 유효성(선택 but 추천)
    if (startDate != null && endDate != null && !startDate.before(endDate)) {
      throw new IllegalArgumentException("endDate must be after startDate");
    }

    EdcLock lock = edcLockPersistence.findByPrimaryKey(lockId);

    if (lockType != null) lock.setLockType(lockType);
    if (comment != null) lock.setComment(comment);

    lock.setStartDate(startDate);
    lock.setEndDate(endDate);

    lock.setModifiedDate(new Date());
    return edcLockPersistence.update(lock);
  }

  public EdcLock deleteLock(long lockId) throws Exception {
    return edcLockPersistence.remove(lockId);
  }
}
