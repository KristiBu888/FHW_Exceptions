package hw.FHW_3;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        try {
            m_get_name.main(args);
            m_birth_date.main(args);
            m_phone_numb.main(args);
            m_pol.main(args);
        } catch (Exception e) {
            System.err.println("Что-то пошло не так (-_-). Попробуйте ещё раз.");
        }
    }
}
