package com.benny.november.business.common.dal.repository;

import com.benny.november.business.common.dal.persistant.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yin.beibei
 * @date 2018/11/22 13:59
 */
public interface UserRepository extends JpaRepository<UserPO,Long> {
}
