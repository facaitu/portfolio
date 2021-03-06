package name.abuchen.portfolio.snapshot.filter;

import java.util.List;
import java.util.Objects;

import name.abuchen.portfolio.model.Client;
import name.abuchen.portfolio.model.Portfolio;
import name.abuchen.portfolio.model.PortfolioTransaction;

public class ReadOnlyPortfolio extends Portfolio
{
    private final Portfolio source;

    ReadOnlyPortfolio(Portfolio source)
    {
        this.source = Objects.requireNonNull(source);
        this.setName(source.getName());
    }

    public Portfolio getSource()
    {
        return source;
    }

    @Override
    public void addTransaction(PortfolioTransaction transaction)
    {
        throw new UnsupportedOperationException();
    }

    void internalAddTransaction(PortfolioTransaction transaction)
    {
        super.addTransaction(transaction);
    }

    @Override
    public void shallowDeleteTransaction(PortfolioTransaction transaction, Client client)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addAllTransaction(List<PortfolioTransaction> transactions)
    {
        throw new UnsupportedOperationException();
    }

    void internalAddAllTransaction(List<PortfolioTransaction> transactions)
    {
        super.addAllTransaction(transactions);
    }
}
