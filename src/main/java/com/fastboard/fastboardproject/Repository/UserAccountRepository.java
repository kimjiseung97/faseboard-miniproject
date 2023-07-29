package com.fastboard.fastboardproject.Repository;

import com.fastboard.fastboardproject.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {
}
