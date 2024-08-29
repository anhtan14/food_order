package com.anhtan.foododering.service;

import com.anhtan.foododering.model.PasswordResetToken;

public interface PasswordResetTokenService {
    public PasswordResetToken findByToken(String token);

    public void delete(PasswordResetToken resetToken);
}
