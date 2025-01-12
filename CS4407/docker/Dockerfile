FROM rocker/rstudio

# 環境設定
ENV LANG ja_JP.UTF-8
ENV LC_ALL ja_JP.UTF-8
RUN /rocker_scripts/install_shiny_server.sh

# フォント
RUN apt-get update && apt-get install -y \
  fonts-ipaexfont \
  fonts-noto-cjk && rm -rf /var/lib/apt/lists/*