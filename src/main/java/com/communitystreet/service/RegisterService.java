package com.communitystreet.service;

import com.communitystreet.domain.ReqUserRegister;
import com.communitystreet.domain.User;

public interface RegisterService {
	boolean isNewUser(ReqUserRegister user);
	int sendMail(String mailbox);
}
