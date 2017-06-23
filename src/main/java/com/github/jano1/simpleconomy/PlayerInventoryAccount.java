package com.github.jano1.simpleconomy;

import com.google.inject.Inject;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.item.inventory.entity.PlayerInventory;
import org.spongepowered.api.service.context.Context;
import org.spongepowered.api.service.economy.Currency;
import org.spongepowered.api.service.economy.account.Account;
import org.spongepowered.api.service.economy.account.UniqueAccount;
import org.spongepowered.api.service.economy.transaction.TransactionResult;
import org.spongepowered.api.service.economy.transaction.TransferResult;
import org.spongepowered.api.text.Text;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Created by jleissner on 23.06.2017.
 */
public class PlayerInventoryAccount implements UniqueAccount{

    public Text getDisplayName() {
        return null;
    }

    public BigDecimal getDefaultBalance(Currency currency) {
        return null;
    }

    public boolean hasBalance(Currency currency, Set<Context> set) {
        return false;
    }

    public BigDecimal getBalance(Currency currency, Set<Context> set) {
        return null;
    }

    public Map<Currency, BigDecimal> getBalances(Set<Context> set) {
        return null;
    }

    public TransactionResult setBalance(Currency currency, BigDecimal bigDecimal, Cause cause, Set<Context> set) {
        return null;
    }

    public Map<Currency, TransactionResult> resetBalances(Cause cause, Set<Context> set) {
        return null;
    }

    public TransactionResult resetBalance(Currency currency, Cause cause, Set<Context> set) {
        return null;
    }

    public TransactionResult deposit(Currency currency, BigDecimal bigDecimal, Cause cause, Set<Context> set) {
        return null;
    }

    public TransactionResult withdraw(Currency currency, BigDecimal bigDecimal, Cause cause, Set<Context> set) {
        return null;
    }

    public TransferResult transfer(Account account, Currency currency, BigDecimal bigDecimal, Cause cause, Set<Context> set) {
        return null;
    }

    public String getIdentifier() {
        return null;
    }

    public Set<Context> getActiveContexts() {
        return null;
    }

    public UUID getUniqueId() {
        return null;
    }
}
