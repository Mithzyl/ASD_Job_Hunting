package Payment;

import java.util.Collections;
import java.util.List;

public interface JobProviderPaymentModel {
    String id="2";

    Float totalAmount=0f;

    List<Integer> createdJobAdIds= Collections.emptyList();
    public Float calculatePayment();
}
