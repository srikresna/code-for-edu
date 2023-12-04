<div class="container-fluid">
    <div class="row">
        <?php
        require 'admin/template/menu.php';
        $id = $_GET['id'];
        $query = "SELECT * FROM jabatan WHERE id = '$id'";
        $result = mysqli_query($koneksi, $query);
        $row = mysqli_fetch_assoc($result);
        ?>
        <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h1 class="h2">Jabatan</h1>
            </div>
            <div class="card col-sm-6">
                <div class="card-header">
                    Form Edit Jabatan
                </div>
                <div class="card-body">
                    <form action="fungsi/edit.php?jabatan=edit" method="post">
                        <input type="hidden" name="id" value="<?= $row['id'] ?>">
                        <div class="mb-3">
                            <label for="jabatan" class="form-label">Nama Jabatan:</label>
                            <input type="text" name="jabatan" class="form-control" id="jabatan" value="<?= $row['jabatan'] ?>" require>
                        </div>
                        <div class="mb-3">
                            <label for="keterangan" class="form-label">Keterangan:</label>
                            <textarea class="form-control" name="keterangan" id="keterangan"><?= $row['keterangan'] ?></textarea>
                        </div>
                        <button type="submit" class="btn btn-primary"><i class="fa fa-floppy-o" aria-hidden="true"></i>Ubah</button>
                    </form>
                </div>
            </div>
    </div>
    </main>
</div>
</div>