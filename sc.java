<script>
// ======================
// Validasi Form Konsultasi
// ======================
document.addEventListener("DOMContentLoaded", function () {
  const form = document.querySelector("section form"); // form konsultasi
  const captchaInput = document.getElementById("captcha");
  const captchaLabel = document.querySelector("label[for='captcha']");

  // Generate captcha otomatis (contoh: random angka)
  let num1 = Math.floor(Math.random() * 10) + 5;
  let num2 = Math.floor(Math.random() * 10) + 1;
  let result = num1 + num2;
  captchaLabel.textContent = `${num1} + ${num2} *`;

  form.addEventListener("submit", function (e) {
    e.preventDefault();

    if (parseInt(captchaInput.value) !== result) {
      alert("Captcha salah, coba lagi!");
      return;
    }

    alert("Form berhasil dikirim! 🎉");
    form.reset();
  });
});

// ======================
// Newsletter (footer)
// ======================
const newsletterForm = document.querySelector("footer form");
if (newsletterForm) {
  newsletterForm.addEventListener("submit", function (e) {
    e.preventDefault();
    const email = newsletterForm.querySelector("input[type='email']").value;
    if (!email) {
      alert("Masukkan email Anda terlebih dahulu!");
    } else {
      alert(`Terima kasih! Email ${email} berhasil didaftarkan ✅`);
      newsletterForm.reset();
    }
  });
}

// ======================
// Tombol Scroll ke Atas
// ======================
let btnTop = document.createElement("button");
btnTop.innerText = "⬆️";
btnTop.style.position = "fixed";
btnTop.style.bottom = "20px";
btnTop.style.right = "20px";
btnTop.style.padding = "10px 15px";
btnTop.style.border = "none";
btnTop.style.borderRadius = "50%";
btnTop.style.background = "#0d6efd";
btnTop.style.color = "white";
btnTop.style.cursor = "pointer";
btnTop.style.display = "none";
document.body.appendChild(btnTop);

window.addEventListener("scroll", () => {
  btnTop.style.display = window.scrollY > 200 ? "block" : "none";
});

btnTop.addEventListener("click", () => {
  window.scrollTo({ top: 0, behavior: "smooth" });
});
</script>
